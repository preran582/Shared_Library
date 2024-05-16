// vars/dockerBuildTag.groovy

def call() {
    stage('Docker Build and Tag') {
        steps {
            sh 'docker build -t prerana004/my-app:2.0.0 .'
        }
    }
}