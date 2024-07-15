package org.generic

def call(String packerFile) {
    stage('Build ami') {
      script {
        sh "packer init ${env.PACKER_TEMPLATE}"
        sh "packer build -var 'ami_name=${params.AMI_NAME}' ${env.PACKER_TEMPLATE}"
      }    
    }
}
