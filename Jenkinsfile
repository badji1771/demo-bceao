pipeline {
    agent any

    stages {



        stage('Build Artifact'){
            steps {
                sh 'mvn clean package -DskipTests=true'
            }
        }

        stage('Lancer les tests'){
            steps {
                sh 'mvn test'
            }
        }

        stage('Build and push Image'){
            steps {
                withDockerRegistry([credentialsId: "my-docker-hub", url: ""]) {
                sh 'docker build -t badji1771/demo-bceao:$BUILD_NUMBER .'
                sh 'docker push badji1771/demo-bceao:$BUILD_NUMBER'
                }
            }
        }

        stage('Deploy to Dev'){
            when { expression { false } }
            steps {
                sh 'docker stop demo-bceao || true'
                sh 'docker rm demo-bceao || true'
                sh 'docker run -p 8180:8180 -d --name demo-bceao demo-bceao'
            }
        }
    }
}
