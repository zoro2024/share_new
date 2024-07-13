import org.generic.Checkout
import org.generic.Gitleaks
import org.generic.TrivyInstaller

def callCheckout(url, branch, creds) {
    new Checkout().call(url, creds, branch)
}

def callGitleaks() {
    new Gitleaks().call()
}

def callTrivyInstaller(repoUrl) {
    new TrivyInstaller().call(repoUrl)
}
