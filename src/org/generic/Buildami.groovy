package org.generic

class Buildami {
    static def build(pipelineContext, envVars, params) {
        pipelineContext.pipeline {
            agent any

            parameters {
                params.each { key, value ->
                    string(name: key, defaultValue: value, description: "Parameter: ${key}")
                }
            }

            environment {
                envVars.each { key, value ->
                    environmentVariables[key] = value
                }
            }

            stages {
                stage('Build AMI') {
                    steps {
                        script {
                            sh """
                            packer init ${env.PACKER_TEMPLATE}
                            packer build -var 'ami_name=${params.AMI_NAME}' ${env.PACKER_TEMPLATE}
                            """
                        }
                    }
                }
            }
        }
    }
}
