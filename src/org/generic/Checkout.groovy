package org.class

class Checkout {
    static void execute(script) {
        script.checkout([
            $class: 'GitSCM',
            branches: [[name: script.params.GIT_BRANCH]],
            userRemoteConfigs: [[url: script.params.GIT_URL]]
        ])
    }
}
