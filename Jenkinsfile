pipeline {
    agent any
    stages {
        agent { dockerfile { dir "./back"} }
        stage('Build') {
            steps {
                echo 'hello'
            }
        }
    }
}