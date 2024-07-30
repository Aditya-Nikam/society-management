Society Management Website
Project Overview
The Society Management Website is a web application designed to assist societies in managing their day-to-day transactions efficiently. This core database project leverages the Spring Boot framework for backend development and MySQL for data storage.

Features
User Authentication and Authorization
Society Member Management
Transaction Management
Dashboard for Visualizing Key Metrics
Notification System for Important Updates
Technologies Used
Programming Languages: Java, JavaScript
Frameworks: Spring Boot
Database: MySQL
Frontend: HTML, CSS, JavaScript
Tools: Maven, Git
Roles and Responsibilities
Managed Backend Development:

Utilized Spring Boot for backend server development.
Designed and implemented RESTful APIs.
Database Management:

Designed, integrated, and maintained the MySQL database.
Ensured data integrity and optimized database performance.
Integration Tasks:

Integrated various modules and third-party services to enhance application capabilities.
Ensured smooth data flow and synchronization between different components of the system.
Testing and Debugging:

Conducted thorough testing to identify and fix bugs.
Performed unit testing and integration testing to maintain code quality and reliability.
Installation and Setup
Prerequisites
JDK 8 or above
Maven
MySQL
Git
Steps to Run the Project
Clone the Repository:

bash
Copy code
git clone <repository-url>
cd society-management-website
Setup the MySQL Database:

Create a new MySQL database.
Update the application.properties file in the src/main/resources directory with your database details.
Build the Project:

bash
Copy code
mvn clean install
Run the Application:

bash
Copy code
mvn spring-boot:run
Access the Application:
Open your web browser and go to http://localhost:8080.

Usage
User Roles
Admin: Manage society members, transactions, and settings.
Member: View transactions, notifications, and personal details.
API Endpoints
Authentication:

POST /api/auth/register - Register a new user
POST /api/auth/login - Login an existing user
Members:

GET /api/members - Get all members
POST /api/members - Add a new member
Transactions:

GET /api/transactions - Get all transactions
POST /api/transactions - Add a new transaction
Contributing
Contributions are welcome! Please fork the repository and create a pull request with your changes.

License
This project is licensed under the MIT License. See the LICENSE file for details.

Contact
For any inquiries or support, please contact Aditya Nikam at adityanikam4047@gmail.com.

