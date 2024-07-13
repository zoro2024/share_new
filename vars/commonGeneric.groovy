import org.generic.Checkout
import org.generic.Gitleaks
import org.generic.TrivyInstaller

def callCheckout() {
    new Checkout().call()
}

def callGitleaks() {
    new Gitleaks().call()
}

def callTrivyInstaller() {
    new TrivyInstaller().call()
}