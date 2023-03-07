def base_path = "gcp-op-as-infra-saas"

pipeline {
  agent any

  

    stages{
    stage('Checkout') {
        steps{
            checkout([$class: 'GitSCM',
            branches: [[name: '!master']],
            userRemoteConfigs: [[url: 'https://github.com/pavanpalveproject/testing']]])
        }
    }

        stage(test){
            steps{
                script(){
                    
                    branch = env.BRANCH_NAME
                    sh 'echo $env.BRANCH_NAME'
                    if(env.BRANCH_NAME == 'master'){
                        sh 'echo psp'
                    }
                }
            }
        }
    }
}