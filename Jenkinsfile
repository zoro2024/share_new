@Library('shared-new') _

pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                script {
                    CommonGeneric.checkoutRepo('https://github.com/OT-MICROSERVICES/attendance-api.git', 'github-token', 'main')
                }
            }
        }
        stage('Run Gitleaks') {
            steps {
                script {
                    CommonGeneric.runGitleaks()
                }
            }
        }
        stage('Install and Run Trivy') {
            steps {
                script {
                    CommonGeneric.installAndRunTrivy('https://github.com/OT-MICROSERVICES/attendance-api.git')
                }
            }
        }
    }
}
