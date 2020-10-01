# MatchesFashion Java Test

Here at MatchesFashion we love API development. 
We would like for you to demonstrate your API & Java strength by completing this exercise.

* try to not spend more than 4 hours.

### What you have been provided
An incomplete java web application built with 
* Gradle
* Spring Boot (mvc & data jpa)
* Java 8
* H2 DB Embedded

Classes
* Product - JPA Entity mapping to 'products' table
* ProductRepository - Spring JPA Repository class

Sample Data
* src/main/resources/data.sql
* loaded in automatically every time the application starts

### The Challenge!

* Develop an URL endpoint which returns all products

 Hint! you can use the ProductRepository which has inherited useful methods ;)  inject it into your class like so
```$xslt
	@Autowired
	private ProductRepository productRepository;

```


* Develop an endpoint which returns all products which cost more than 100


### System Requirements

* JDK 8


### To Start Application

```
./gradlew bootRun -i
```
* this will start a server on http://localhost:8080
* you can change the port under application.properties

### Sending us your solution

* Link to your public git repo 
* Or a link to your zipped up code
