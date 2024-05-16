// vars/runDockerContainer.groovy

def call() {
    stage('Run Docker container') {
        steps {
            sh "docker run --name new_App -d -p 8080:8080 prerana004/my-app:2.0.0"
        }
    }
}