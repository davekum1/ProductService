## Synopsis

This is sample RESTful project build with SpringBoot. 

## Jenkins
This git repo is set to Jenkins job for CI/CD demo purposes.  
Jenkins URL is: http://104.236.103.221:8081/  
User id: guest  
Password: guest  
  
There will be three jobs already configured.  
1. FunShop  
2. FunShopStart  
3. FunShopStop  

<i>FunShop</i>  
This is the main job which will pull the codes from this repo, compile, and deploy as spring boot application using maven.  
Note: This job does not currently auto deploy the service. You will need to run FunShopStart to start the service  
  
<i>FunShopStart</i>  
This is to start the service. Please note that currently this job is set as not a background job. You will see once the build is initiated, it will keep running until you cancel the job or starting FunShopStop. Stopping this job will shut down RESTful service.  

<i>FunShopStop</i>  
This is to stop the service.  

