# Getting started

This document describes the steps required to get started with this PoC.

## Installation of Minikube and Tekton

To install Minikube please follow [upstream documentation](https://kubernetes.io/docs/tasks/tools/install-minikube/).


To install Tekton please follow [upstream documentation](https://github.com/tektoncd/pipeline/blob/master/docs/install.md). But basically this is it:

```
❯ kubectl apply --filename https://storage.googleapis.com/tekton-releases/pipeline/latest/release.yaml
```

You want to install CLI tools as well:

* [`tkn`](https://github.com/tektoncd/cli)
* [`kubectl`](https://kubernetes.io/docs/tasks/tools/install-kubectl/)

## Preparation of keytab secret

To be able to authenticate with systems using Kerberos pipelines require an active Kerberos ticket.
Such ticket is obtained at the start of the pipeline and destroyed at the end.

User needs to provide own secret containing the principal name and the keytab file as well.

**NOTE**: In a production environment this will be provided by the system.

First we need to create the keytab file if we don't have one already:

```
❯ ktutil
ktutil:  addent -password -p mgoldman@DOMAIN.COM -k 1 -e aes256-cts
Password for mgoldman@DOMAIN.COM: 
ktutil:  wkt mgoldman.keytab
ktutil:  quit
```

Once this is done, we have the keytab stored in the `mgoldman.keytab` file.

Now we can create the secret:

```
❯  kubectl create secret generic keytab --from-file=keytab=mgoldman.keytab --from-literal=principal=mgoldman@DOMAIN.COM
```

This will create a `keytab` secret. The keytab file will be available as `keytab`
key within this secret. Principal name will be available under the `principal` key.

## Creating objects and running the pipeline

Running below script will prepare all required resources and

```
❯ run.sh
```

### Useful commands

* `tkn p list` - list all pipelines
* `tkn pr list` - list all pipeline runs
* `tkn pr logs -f` - follow logs for particular pipeline run (you will be able to choose a specific run)
* `tkn pr describe component-f3f45956-b3f1-427e-9dc4-c01a620d97ae-rkldc` - get useful information about specific pipeline run
