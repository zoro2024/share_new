@Library('shared-new') _

pipeline {
    agent any

    stages {
        stage('Run Common Generic') {
            steps {
                script {
                    // Define variables
                    def repoUrl = 'https://github.com/OT-MICROSERVICES/attendance-api.git'
                    def creds = 'github-token'
                    def branch = 'main'

                    // Call the function from shared library
                    CommonGeneric(repoUrl, creds, branch)
                }
            }
        }
    }
}
