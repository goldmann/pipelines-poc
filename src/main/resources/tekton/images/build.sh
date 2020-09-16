#!/bin/sh

set -e

podman build . -t quay.io/goldmann/cpaas-poc-executor:latest
