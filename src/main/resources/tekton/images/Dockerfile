FROM ubi8/ubi-minimal:8.2

RUN microdnf -y install krb5-workstation python3 && microdnf clean all

COPY krb5.conf /etc/krb5.conf
