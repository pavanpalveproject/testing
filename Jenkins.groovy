def base_path = "gcp-op-as-infra-saas"

pipeline {
  agent any

  

    stages{
        stage(test){
            steps{
                script(){
                    checkout scm
                    // branch = env.BRANCH_NAME
                    // sh 'echo $env.BRANCH_NAME'
                    if(env.BRANCH_NAME == 'master'){
                        sh 'echo psp'
                    }
                }
            }
        }
    }
}