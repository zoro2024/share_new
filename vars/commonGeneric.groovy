// shared-new/vars/CommonGeneric.groovy
package vars

import org.generic.Checkout
import org.generic.Gitleaks
import org.generic.TrivyInstaller

def call(String repoUrl, String credsId, String branch) {
    Checkout checkout = new Checkout()
    Gitleaks gitleaks = new Gitleaks()
    TrivyInstaller trivyInstaller = new TrivyInstaller()

    pipeline {
        agent any
        
        stages {
            stage('Checkout') {
                steps {
                    script {
                        checkout.clone(repoUrl, credsId, branch)
                    }
                }
            }
            
            stage('Run Gitleaks') {
                steps {
                    script {
                        gitleaks.run()
                    }
                }
            }
            
            stage('Install Trivy and Scan') {
                steps {
                    script {
                        trivyInstaller.installTrivy(repoUrl)
                    }
                }
            }
        }
    }
}
