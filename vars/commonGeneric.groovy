import org.generic.File1
import org.generic.File2

def call() {
    def message = File1.getFile1Message()
    echo message
}

def call1() {
    def message = File2.getFile2Message()
    echo message
}

