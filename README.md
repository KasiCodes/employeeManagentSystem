# Employee Management System

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Overview
The Employee Management System is a web application that allows users to manage employee records efficiently. This system provides features for adding, updating, deleting, and viewing employee information, making it easier for organizations to maintain their workforce data.

## Features
- **User-friendly Interface**: Intuitive design for easy navigation.
- **Employee CRUD Operations**: Create, Read, Update, and Delete employee records.
- **Pagination**: Efficiently manage large datasets with pagination.
- **Search Functionality**: Quickly find employees by name or other criteria.
- **Secure Authentication**: Protect sensitive information with secure user authentication.
- **Responsive Design**: Access the application on various devices.

## Technologies Used
- **Java**: The primary programming language used for the backend.
- **Spring Boot**: Framework for building the web application.
- **Thymeleaf**: Templating engine for rendering HTML views.
- **MySQL**: Database management system for storing employee records.
- **Maven**: Dependency management and build tool.
- **HTML/CSS/JavaScript**: Frontend technologies for user interface design.

## Installation
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/KasiCodes/employeeManagementSystem.git
   ```
2. **Navigate to the Project Directory**:
   ```bash
   cd employeeManagementSystem
   ```
3. **Configure Database**:
   - Set up a MySQL database and update the `application.properties` file with your database credentials.
4. **Build the Project**:
   ```bash
   mvn clean install
   ```
5. **Run the Application**:
   ```bash
   mvn spring-boot:run
   ```

## Usage
- Open your web browser and navigate to `http://localhost:8080`.
- Use the application to manage employee records.

## Contributing
Contributions are welcome! Please follow these steps:
1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Commit your changes and push to the branch.
4. Open a pull request for review.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
