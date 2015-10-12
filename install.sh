#!/bin/bash

curl https://raw.githubusercontent.com/cloudius-systems/capstan/master/scripts/download | bash
sudo aptitude install -y qemu

echo "Don't forget to enable you processor virtualization features (BIOS setting)"
