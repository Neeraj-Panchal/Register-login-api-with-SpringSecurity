# Register-login-api-with-SpringSecurity

## How to Use This Repository

Follow the steps below to clone, set up, and run this project on your local machine.

---

## 1. Clone the Repository

To get started, clone the repository to your local machine by running the following command:

```bash
git clone https://github.com/Neeraj-Panchal/Register-login-api-with-SpringSecurity.git
```

This will create a copy of the repository on your local system.

---

## 2. Navigate to the Project Directory

Once the repository is cloned, change to the project directory:

```bash
cd Register-login-api-with-SpringSecurity
```

---

## 3. Open the Project in Your IDE

Open the project in your preferred Integrated Development Environment (IDE):

- IntelliJ IDEA (recommended for Spring Boot projects)
- Eclipse
- VS Code

For IntelliJ IDEA:

Open the project directly from the `Register-login-api-with-SpringSecurity` directory.

---

## 4. Build the Project

The project uses Maven for dependency management. To build the project and download all required dependencies, run the following command:

```bash
mvn clean install
```

This will ensure that all necessary libraries are available and the project is properly set up.

---

## 5. Run the Application

After building the project, you can run the application with the following command:

```bash
mvn spring-boot:run
```

Your application will now be running locally at:

[http://localhost:8080](http://localhost:8080)

---

## 6. Configure the Database (Optional)

If your project requires a database connection, ensure that your MySQL server (or the database you are using) is up and running.

Update the connection details in the `application.properties` or `application.yml` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
```

---

## 7. Run Tests (Optional)

To run the unit tests in the project, use the following Maven command:

```bash
mvn test
```

This will run all tests to ensure the application is functioning correctly.

---

## Troubleshooting

### 1. Error: `git: command not found`

This error occurs if Git is not installed on your machine. To resolve it, download and install Git from:

[https://git-scm.com/downloads](https://git-scm.com/downloads)

### 2. Error: Database Connection Failure

Ensure that:

- Your MySQL server (or chosen database) is running.
- The database connection details in `application.properties` are correct.

---

## Additional Information

For any issues or questions, feel free to open an issue on the repository.
