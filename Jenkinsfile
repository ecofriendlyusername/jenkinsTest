pipeline {
    agent any
    stages {
        stage('End') {
            agent any
            steps {
               sh "hello"
            }
        }
        stage('Run') {
            docker.build("tat","./back")
            docker.image("tat").withRun("-p 5050:5050")
        }
    }
}