import org.generic.Checkout
import org.generic.Gitleaks
import org.generic.TrivyInstaller

def checkoutRepo(String url, String creds, String branch) {
    Checkout checkout = new Checkout()
    checkout(url, creds, branch)
}

def runGitleaks() {
    Gitleaks gitleaks = new Gitleaks()
    gitleaks()
}

def installAndRunTrivy(String repoUrl = '') {
    TrivyInstaller trivy = new TrivyInstaller()
    trivy.installTrivy(repoUrl)
}

