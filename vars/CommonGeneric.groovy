// import org.generic.Checkout
// import org.generic.Gitleaks
// import org.generic.TrivyInstaller

// def checkoutRepo(String url, String creds, String branch) {
//     new Checkout().call(url, creds, branch)
// }

// def runGitleaks() {
//     new Gitleaks().call()
// }

// def installAndRunTrivy(String repoUrl = '') {
//     new TrivyInstaller().installTrivy(repoUrl)
// }

import org.generic.Buildami

def buildami() {
    Buildami.build(this)
}
