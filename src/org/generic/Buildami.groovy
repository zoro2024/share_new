package org.generic

def call(String packerTemplate, String amiName) {
    sh """
    packer init ${packerTemplate}
    packer build -var 'ami_name=${amiName}' ${packerTemplate}
    """
}
