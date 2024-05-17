def call() {
    stage('SCM Checkout') {
        steps {
            git credentialsId: 'git-creds', url: 'https://github.com/preran582/java-webapp-tomcat-docker.git'
        }
    }
}
