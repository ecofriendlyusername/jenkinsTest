pipeline {
    agent { dockerfile true }
    stages {
        stage('Test') {
            steps {
                sudo apt-get install dos2unix
                echo 'hello'
            }
        }
    }
}
