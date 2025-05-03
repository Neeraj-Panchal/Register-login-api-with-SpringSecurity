# Register-login-api-with-SpringSecurity

## How to Use This Repository

Follow the steps below to clone, set up, and run this project on your local machine.

---

## 1. Clone the Repository

To get started, clone the repository to your local machine:

```bash
git clone https://github.com/Neeraj-Panchal/Register-login-api-with-SpringSecurity.git
```

## 2. Navigate to the Project Directory
Change to the project directory:

```bash
cd Register-login-api-with-SpringSecurity
```

## 3. Open the Project in Your IDE
Open the project in your preferred IDE:

IntelliJ IDEA (recommended for Spring Boot)

Eclipse

VS Code

In IntelliJ IDEA, open the folder Register-login-api-with-SpringSecurity.

## 4. Configure the Database
This project requires a MySQL database. Make sure MySQL is running on your system.

## Option A: Use .env file
Create a .env file in the root directory and add the following:

```bash
DB_URL=jdbc:mysql://localhost:3306/your_database
DB_USERNAME=your_username
DB_PASSWORD=your_password
```
Note: Make sure your code is configured to read these environment variables.

## Option B: Edit application.properties
Update the src/main/resources/application.properties file:

```bash
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
```
## 5. Build the Project
Use Maven to install dependencies and build the project:
```bash
mvn clean install
```
## 6. Run the Application
To start the Spring Boot application:

```bash
mvn spring-boot:run
```
Your API will be available at:

http://localhost:8080

## 7. Run Tests (Optional)
Run unit tests using Maven:

```bash
mvn test
``` 

## Troubleshooting
### 1. Error: git: command not found
This error occurs if Git is not installed. Download it from:

https://git-scm.com/downloads

### 2. Database Connection Failure
Ensure that:

MySQL server is running

Correct DB name, username, and password are configured

The database exists in your local MySQL instance
