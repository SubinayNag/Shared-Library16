import groovy.json.JsonSlurper 

@NonCPS
Nexus(String data){
def jsonSlurper = new JsonSlurper() 
def resultJson = jsonSlurper.parseText(data)
                    def artifactId:"Web_Build_Artifacts",
                    def classifier: "",
                    def filePath: "target/JenkinsWar.war",
                    def type: "war",
                    def credentialsId: "nexus",
                    def groupId: "maven-group",
                    def nexusUrl: "ec2-18-224-155-110.us-east-2.compute.amazonaws.com:8081/nexus",
                    def nexusVersion: "nexus",
                    def protocol: "http",
                    def repository: "kishan-test",
                    def version: "${env.BUILD_NUMBER}"



                      }
def call(){
def request = libraryResource 'data.json'
 Nexus(request)
}
