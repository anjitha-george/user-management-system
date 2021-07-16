# Simple User Management System
## Tech Stack
1.	Language : Java,TypeScript,HTML
2.	Framework: Spring Boot, Angular

The application is divided into two Maven modules:
1. `backend`: This contains Java code of the application.
2. `ui`: This contains source code for the Angular based frontend.

## How to run the code
1.	Extract the zip file to a local location.
2.	Open command line at the root location.
3.	Run command `mvn.cmd clean install`
4.	Next, you can run the application by executing:
    ```bash
    $ java -jar backend/target/app.jar
    ``` 
5.	The application will be accessible at http://localhost:8081
6.	The user management page will be displayed


## Functionality
1.	Open "http://localhost:8081 " in browser.
2.	The user management page with 2 users is displayed
3.	Click on `Add new User` button
4.	Enter the user details and click on create button. User fields are validated and the user is created.
5.	To view the the list of existing users, click on `View Users`.
6.	To delete a user, click on `Delete` button, and the user will be deleted.


