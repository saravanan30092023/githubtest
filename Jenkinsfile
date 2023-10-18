pipeline {
    agent any
    environment {
        mavenHome = tool 'mavenjenkins'
        PATH = "${mavenHome}/bin:${PATH}"
    }
    stages {
        stage('Info') {
            steps {
                echo "$env.JOB_NAME"
                echo "$env.BUILD_NUMBER"
                echo "$env.BUILD_ID"
                echo "$env.BUILD_URL"
            }
            
        }
        stage('Compile') {
            steps {
                sh "mvn clean compile"
            }
        }
        stage('Test') {
            steps {
                sh "mvn test"
            }
        }
        stage('Package') {
            steps {
                sh "mvn package -DskipTests"
            }
        }
        
    post{
        always{
            echo "This is always executed"
        }
        success{
            echo "This is executed only if the build succeeds"
        }
        failure{
            echo "This is executed only if the build fails"
        }
    }
}
