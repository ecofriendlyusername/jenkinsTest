pipeline {
    agent none
    stages {
       stage('run') {
            agent any
            steps {
                sh 'pwd'
                def testImage = docker.build("test-image","./back")
                docker.image("test-image").withRun('-p 5050:5050')
            }
        }
    }
}
