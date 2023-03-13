pipeline {
agent any
    stages {
        stage('run') {
            agent {
          dockerfile { dir "./back" }
    }
            steps {
                echo 'testing... hello'
                sh 'pwd'
            }
        }
    }
}
