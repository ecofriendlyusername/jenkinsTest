pipeline {
    agent any
    stages {
        stage('Build') {
            agent { dockerfile { dir "./back"} }
            steps {
                echo 'hello'
            }
        }
    }
}