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
                    checkout(repoUrl, credsId, branch)
                }
            }
            
            stage('Run Gitleaks') {
                steps {
                    gitleaks()
                }
            }
            
            stage('Install Trivy and Scan') {
                steps {
                    trivyInstaller.installTrivy(repoUrl)
                }
            }
        }
    }
}
