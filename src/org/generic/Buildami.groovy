package org.generic

def call(packerTemplate, amiName) {
    sh """
    packer init ${packerTemplate}
    packer build -var 'ami_name=${amiName}' ${packerTemplate}
    """
}
