#!/bin/sh

set -e

DIR=`dirname "$0"`

kubectl replace -f ${DIR}/definitions.yaml
kubectl create -f ${DIR}/run.yaml
