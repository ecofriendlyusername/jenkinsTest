node {
                sh 'pwd'
                def testImage = docker.build("test-image","./back")
                docker.image("test-image").withRun('-p 5050:5050')
}
