// vars/mavenBuild.groovy

def call() {
    stage('maven build') {
            script {
                def mvnHome = tool name: 'maven-3', type: 'maven'
                def mvnCMD = "${mvnHome}/bin/mvn"
                sh "${mvnCMD} clean package"
            }
        }
    }
