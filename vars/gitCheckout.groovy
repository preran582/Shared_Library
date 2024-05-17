def call() {
    stage('SCM Checkout') {
            git credentialsId: 'git-creds', url: 'https://github.com/preran582/my-app.git'
    }
}
