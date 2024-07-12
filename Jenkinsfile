@Library('shared_library') _

pipeline {
    agent any
    stages {
        stage('Call Common Generic') {
            steps {
                script {
                    commonGeneric()
                }
            }
        }
    }
}
