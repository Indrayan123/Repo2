stage('Invoke Local Script')
{
script{
purpose='SAmple test'
def print_details=load("Print_Details.groovy")
print_details(purpose)
}}
