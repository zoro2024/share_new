@Library('shared-new') _

pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                script {
                    // Ensure the CommonGeneric class is imported correctly
                    CommonGeneric.checkoutRepo('https://github.com/OT-MICROSERVICES/attendance-api.git', 'github-token', 'main')
                }
            }
        }
        stage('Run Gitleaks') {
            steps {
                script {
                    // Call the method from CommonGeneric
                    CommonGeneric.runGitleaks()
                }
            }
        }
        stage('Install and Run Trivy') {
            steps {
                script {
                    // Call the method from CommonGeneric
                    CommonGeneric.installAndRunTrivy('https://github.com/OT-MICROSERVICES/attendance-api.git')
                }
            }
        }
    }
}
