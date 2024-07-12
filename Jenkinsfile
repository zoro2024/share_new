@Library('shared_new') _

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
