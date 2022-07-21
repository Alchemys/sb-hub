#!/usr/bin/env bash

# NOTE this is a script for generating the protobuf source files used by this application.
# This assumes a *nix environment where the protobuf binaries have already been installed
# E.g.
# `> sudo apt install protobuf-compiler`
# To ensure the protobuf compiler has been installed correctly:
# `> protoc --version`
# Should produce something like
# `libprotoc 3.6.1`

# Generate the protobuf Java Source and add / overwrite the existing files
# The protobuf files don't change often so this only needs to be run whenever they do change.

# NOTE Run this from the sb-hub project root!
protoc --proto_path=src/main/protobuf/com/townsendsoftware/sbhub/protos --java_out=src/main/java/ sbhub.proto