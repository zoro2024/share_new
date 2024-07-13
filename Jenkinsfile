@Library('shared_library') _

pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                script {
                    commongeneric.callCheckout()
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
                    commongeneric.callTrivyInstaller()
                }
            }
        }        
    }
}