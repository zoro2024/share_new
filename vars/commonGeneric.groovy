// shared_library/vars/commonGeneric.groovy
package org.generic

import org.generic.File1

def call() {
    def message = File1.getFile1Message()
    echo message
}
