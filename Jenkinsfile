@Library('shared_new') _

pipeline {
    agent any

    environment {
        URL = 'https://github.com/OT-MICROSERVICES/attendance-api.git'
        BRANCH = 'main'
        CREDS = 'github-token'
        REPOURL = 'https://github.com/OT-MICROSERVICES/attendance-api.git'
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    commongeneric.callCheckout(URL, BRANCH, CREDS)
                }
            }
        }
        stage('Cred scanning') {
            steps {
                script {
                    commongeneric.callGitleaks()
                }
            }
        }
        stage('License Scanning') {
            steps {
                script {
                    commongeneric.callTrivyInstaller(REPOURL)
                }
            }
        }
    }
}
