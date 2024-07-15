package org.generic

def call() {
    sh """
    packer init packer.pkr.hcl
    packer build packer.pkr.hcl
    """
}
