def call() {
    stage('SCM Checkout') {
        steps {
            git credentialsId: 'git-creds', url: 'https://github.com/preran582/my-app.git'
        }
    }
}
