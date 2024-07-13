@Library('shared-new') _

pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                script {
                    @NonCPS
                    CommonGeneric.checkoutRepo('https://github.com/OT-MICROSERVICES/attendance-api.git', 'github-token', 'main')
                }
            }
        }
        stage('Run Gitleaks') {
            steps {
                script {
                    @NonCPS
                    CommonGeneric.runGitleaks()
                }
            }
        }
        stage('Install and Run Trivy') {
            steps {
                script {
                    @NonCPS
                    CommonGeneric.installAndRunTrivy('https://github.com/OT-MICROSERVICES/attendance-api.git')
                }
            }
        }
    }
}
