REST API
-------------------------------------------------------------------------------------------------------------------------
Simple REST API for aviation related data that manages airports, aircraft, cities and passengers.
This project uses MySQL Workbench, Postman and Docker.
-------------------------------------------------------------------------------------------------------------------------
How To Work the Program:

 - Frist Have MySQL Workbench running a local instance and create a database called s4_sdat_qap2_db
   OR name it anything you want as long as your change the name in the application.properties and docker-compose.yml files.
   
 - Once your created your database, run the file called RestServiceApplication
 - When you run the program all the tables and relationship will be created in your MySQL database automatically.

 - Next lunch Postman and do a GET on http://localhost:8080/ to see all the links.
 - Once your Local host instance is working with the database you can start add data
 - To add data you can do a POST to the http://localhost:8080/passenger_repo
 - To post you must enter the correct JSON format in the body, for example:
                         {
                         "firstName" : "John",
                         "lastName" : "Doe",
                         "phoneNumber": "(709) 683 0000"
                         }
 - You can do a POST to all the repo links, look at all the class objects to find the corrcect format for each class
--------------------------------------------------------------------------------------------------------------------------------
Relationships

- To setup your relationships you must 
