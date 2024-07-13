@Library('shared_library') _

pipeline {
    agent any

    parameters {
        string(name: 'REPO_URL', defaultValue: 'https://github.com/OT-MICROSERVICES/attendance-api.git', description: 'Repository URL')
        string(name: 'CREDS_ID', defaultValue: 'github-token', description: 'Credentials ID')
        string(name: 'BRANCH', defaultValue: 'main', description: 'Branch to checkout')
    }

    stages {
        stage('Run Pipeline') {
            steps {
                script {
                    commonGeneric.call(REPO_URL, CREDS_ID, BRANCH)
                }
            }
        }
    }
}
