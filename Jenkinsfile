


pipeline{
  agent any
  environment{
    docker_credentials=credentials('dockerhub')
  }
  stages{
    
    stage('Test'){
      steps{
        echo 'test'
      }
    }
    stage('Build'){
      steps{
        sh 'echo docker_credentials_psw|docker login -u docker_credentials_usr --password-sdtin'
        sh 'mvn install -DskipTests'
        sh 'docker build -t onesmus1024/wambugu-grocery-product-service .'
      }
    }
    stage('push'){
      steps{
        sh 'docker push onesmus1024/wambugu-grocery-product-service  '
      }
    }
    stage('Deploy'){
      steps{
        echo "docker push onesmus1024/wambugu-grocery-product-service  "
      }
    }
  }
  
  
}
