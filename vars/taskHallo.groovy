#!/usr/bin/env groovy
def call(String name = 'test') {
  echo "Hello, ${name}."
  1 * script.sh(
                    """
                    aws ecr-public get-login-password --region us-east-1 | docker login --username AWS --password-stdin public.ecr.aws/o8e3g5w6
                    
                    """
}
def login() {
        1 * script.sh(
                    """
                    aws ecr-public get-login-password --region us-east-1 | docker login --username AWS --password-stdin public.ecr.aws/o8e3g5w6
                    
                    """
        )
    }
