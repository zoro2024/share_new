@Library('shared-new') _

node {
    stage('Run Common Generic') {
        // Define the variables
        def repoUrl = 'https://github.com/OT-MICROSERVICES/attendance-api.git'
        def creds = 'github-token'
        def branch = 'main'
        def trivyRepoUrl = 'https://github.com/OT-MICROSERVICES/attendance-api.git'

        // Create an instance of Commongeneric class
        def commonGeneric = commongeneric()

        // Execute runAll method with parameters
        commonGeneric.runAll(repoUrl, creds, branch, trivyRepoUrl)
    }
}
