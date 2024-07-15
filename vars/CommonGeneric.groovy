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

import static vars.org.generic.Buildami

def buildami(String packerTemplate, String amiName) {
    new Buildami().call(packerTemplate, amiName)
}
