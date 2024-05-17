// vars/pushDockerImage.groovy

def call() {
    stage('Push Docker image') {
            withCredentials([string(credentialsId: 'docker-pwd', variable: 'dockerHubPWD')]) {
                sh "docker login -u prerana004 -p ${dockerHubPWD}"
            }
            sh 'docker push prerana004/my-app:2.0.0'
        }
    }
