# MyRetail PRODUCT Service
MyRetail RESTful project

## Getting started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes  
  
### Prerequisites
You will need following tools below to have it up and running in your local  
1. JDK (This was compiled with JDK 1.8, but it should work with previous version of Java too)  
2. Eclipse or equivalent Java IDE  
3. Maven plugin for your IDE  
4. Maven (only if you want to run in your terminal)  
5. MongoDB (this was developed using 3.4.2)  

### Installing
 Importing program
```
1. Clone this repo in your local  
2. Import this project as existing Maven project
3. To compile, type "mvn package"
4. Install 
```
   
Installing MongoDB
```
1. Install MongoDB to your local  
2. Once installed, open up mongo shell   
3. This program is created using default test database in Mongo  
4. You will need to create new collection called "ProductPricing"  
5. Type db.createCollection("ProductPricing")  
6. Insert new data to newly created collection  
7. Type “db.ProductPricing.insert({ productId: '13860428', currentPrice : 19.99, currencyName : "USD" })”  
```

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

## Built With  
  
* [Spring](http://www.spring.io) - The web framework used  
* [Maven](https://maven.apache.org/) - Dependency Management  
* [Jenkins](https://jenkins.io) - Automation tool  
* [Eclipse](https://eclipse.org) - IDE  
* [Java](https://www.oracle.com/java) - Programming language  
* [MongoDB](https://www.mongodb.com) - NoSQL database  




## Author
David Kumoro  
