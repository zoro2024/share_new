@Library('shared-new') _

pipeline {
    agent any

    stages {
        stage('Run Common Generic') {
            steps {
                script {
                    // Define the variables
                    def repoUrl = 'https://github.com/OT-MICROSERVICES/attendance-api.git'
                    def creds = 'github-token'
                    def branch = 'main'
                    def trivyRepoUrl = 'https://github.com/OT-MICROSERVICES/attendance-api.git'

                    // Call the commonGeneric function directly
                    commonGeneric.runAll(repoUrl, creds, branch, trivyRepoUrl)
                }
            }
        }
    }
}


