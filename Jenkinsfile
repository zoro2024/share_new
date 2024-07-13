node {
    // Inside the node block, define your pipeline stages
    stage('Run Common Generic') {
        // Define the variables
        def repoUrl = 'https://github.com/OT-MICROSERVICES/attendance-api.git'
        def creds = 'github-token'
        def branch = 'main'
        def trivyRepoUrl = 'https://github.com/OT-MICROSERVICES/attendance-api.git'

        // Create an instance of commonGeneric class
        def commonGeneric = new commonGeneric()

        // Execute runAll method with parameters
        commonGeneric.runAll(repoUrl, creds, branch, trivyRepoUrl)
    }
}
