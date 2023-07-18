# Api-Rest-Project
Api Rest for CRUD operations
This project is a Java application based on Spring Boot to manage college students and their college journey.

## Features

- Adding students with personal information, such as first name, last name, date of birth, major, and city.
- Viewing details of a specific student by id.
- Viewing details of all students.
- Editing student information.
- Removing information for each student.

## Technologies 
- Eclipse IDE
- Java 19.0.2
- Spring Boot 2.5.4
- Maven 3.9.3
- MyBatis
- Mysql
- MySQL Workbench
- Postman

## Configuration of working environment

1. Make sure you have Java Development Kit (JDK) version 19.0.2 or later installed.
2. Add the Spring tools 4 plugin.
3. Create a new Spring boot project using Maeven as a tool to manage dependencies.
4. Create a folder named mapper under the path src/main/resources.
5. Inside the folder place the class StudentsMapper.xml and the xml queries.
6. Define the package that contains the java classes com.example.project in the path src/main/java
7. Edit the `application.properties` file in the `src/main/resources` folder to configure the database connection.
8. Creates a db called DB_STUDENTS and inside it creates a Students table.
9. The student table has several columns: id, first name, last name, date of birth, major and city.
10. Create 5 dummy instances of the students table.
11. Create the student class, StudnteMapper, StudentService and StudentController

## API
The following APIs are available to interact with the application:
- **POST /api/students**: Adds a new student.
- **GET /api/students**: Gets the list of all students.
- **GET /api/students/{id}**: Gets the detailed information of a specific student.
- **PUT /api/students/{id}**: Changes the information of an existing student.
- **DELETE /api/students/{id}**: Deletes a student.

## Contributions

Contributions to this project are welcome. If you would like to contribute, please follow the steps below:

1. Fork the repository.
2. Create a new branch for your contribution: `git checkout -b <name-branch>`.
3. Make the desired changes.
4. Commit your changes: `git commit -m "Commit description"`.
5. Pusha your branch to the remote repository: `git push origin <name-branch>`.
6. Send a pull request to review your changes.
