node{
  //stage('Invoke Local Script'){
  def print_details=load("./Print_Details.groovy")
script{
purpose='SAmple test'

print_details(purpose)
}}
//}
