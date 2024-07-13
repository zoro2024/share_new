import org.generic.Checkout
import org.generic.Gitleaks
import org.generic.TrivyInstaller

def call(String repoUrl, String credsId, String branch) {
    node {
        try {
            stage('Checkout') {
                Checkout checkout = new Checkout()
                checkout.clone(repoUrl, credsId, branch)
            }
            
            stage('Run Gitleaks') {
                Gitleaks gitleaks = new Gitleaks()
                gitleaks.run()
            }
            
            stage('Install Trivy and Scan') {
                TrivyInstaller trivyInstaller = new TrivyInstaller()
                trivyInstaller.installTrivy(repoUrl)
            }
        } catch (Exception e) {
            currentBuild.result = 'FAILURE'
            throw e
        }
    }
}
