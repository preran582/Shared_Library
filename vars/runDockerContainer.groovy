// vars/runDockerContainer.groovy

def call() {
    stage('Run Docker container') {
            sh "docker run --name new_App_groovy -d -p 8082:8080 prerana004/my-app:2.0.0"
    }
}
