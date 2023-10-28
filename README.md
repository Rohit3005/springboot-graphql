# springboot-graphql
GraphQL is a query language that offers an alternative model to developing APIs (REST, SOAP or gRPC) with detailed description

# Technology
Our Spring Boot application will use:

- Java 8
- Spring Boot 2 (with Spring Web, Spring Data JPA)
- graphql-spring-boot-starter 5.0.2
- graphql-java-tools 5.2.4
- Maven 3.6.1
- MySQL

# Set up the project
Create new Spring Boot project using Spring Tool Suite or going to https://start.spring.io/.

Then add these dependencies to pom.xml file:

# Graphql 
                 <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-graphql</artifactId>
		</dependency>

                <dependency>
			<groupId>org.springframework.graphql</groupId>
			<artifactId>spring-graphql-test</artifactId>
			<scope>test</scope>
		</dependency>


 # Create GraphQL Schema
We’re gonna split up your schema into two .graphqls files. The Spring Boot GraphQL starter will automatically find these schema files.

Under src/main/resources folder, create author.graphqls and tutorial.graphqls files

# Define the Employee type
type Employee {
  empId: ID!
  empName: String!
  empAddress: String
  empSalary: Float
  empContactNumber: Int
  empEmailId: String
  empPassword: String
}



# Define queries to fetch employee data
type Query {
  getEmployee(empId: ID!): Employee
  getAllEmployees: [Employee]
}

# API Testing POSTMAN API
For checking result, you can use Postman to make HTTP POST request to http://localhost:8080/graphql.
