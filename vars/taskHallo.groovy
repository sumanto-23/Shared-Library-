#!/usr/bin/env groovy
def call(String name = 'test') {
  echo "Hello, ${name}."
}
 def "Test login to AWS ECR Docker Registry using AWS CLI 2"() {
        when:
            dockerEcr.loginToAWSECRDockerRegistry(2)
        then:
        1 * script.sh(
                    """
                    aws ecr get-login-password --region eu-west-2 \
                    | docker login -u AWS https://066203203749.dkr.ecr.eu-west-2.amazonaws.com --password-stdin
                    """
        )
    }

