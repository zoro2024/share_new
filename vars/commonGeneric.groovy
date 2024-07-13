package org.common

import org.generic.Checkout
import org.generic.Gitleaks
import org.generic.TrivyInstaller

class commongeneric {
    def runAll(String url, String creds, String branch, String repoUrl) {
        def checkout = new Checkout()
        def gitleaks = new Gitleaks()
        def trivyInstaller = new TrivyInstaller()

        node {
            try {
                stage('Checkout') {
                    checkout.clone(url, creds, branch)
                }

                stage('Run Gitleaks') {
                    gitleaks.run()
                }

                stage('Install Trivy and Scan') {
                    trivyInstaller.installTrivy(repoUrl)
                }
            } catch (Exception e) {
                currentBuild.result = 'FAILURE'
                throw e
            }
        }
    }
}
