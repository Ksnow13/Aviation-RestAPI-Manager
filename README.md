REST API
--------------------------------------------------------------------------------------------------------------------------------
Simple REST API for aviation related data that manages airports, aircraft, cities and passengers.
This project uses MySQL Workbench, Postman and Docker.
--------------------------------------------------------------------------------------------------------------------------------
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

  Airport & Cities
- To assign a city to an airport you must give an airport a city in MySQL Workbench.
- To see the relationship enter GET city_repo/{id}/city or GET city_repo/{id}airports   in Postman.

  Passengers & Cities
- The city a passenger is from.
- This works the same as (Airport & Cities) above, you can add to it and display it the same way
- GET passenger_repo/{id}/city  in Postman

  Aircraft & Airports
- To Add airports to an aircraft's land/take off list you must do a PATCH on Postman with the link http://localhost:8080/aircraft_repo/{id}/aircrafts
  Then in Header you must add Content-Type - text/uri-list
  to add an airport to the list, put http://localhost:8080/aircraft_repo/{id} in the body as text.
- To see the list enter GET http://localhost:8080/aircraft_repo/{id}/aircrafts

  Passenger & Airports
- List of airports a passenger has visited.
- This works the same as (Aircraft & Airport) above, you can add to it and display it the same way
- do a PATCH on Postman with the link http://localhost:8080/passenger_repo/{id}/airports
- to add an airport to the list, put http://localhost:8080/airport_repo/{id} in the body as text.
- To see the list enter GET http://localhost:8080/passenger/{id}/airports

  Passenger & Aircraft's
- List of aircraft's a passenger has been on.
- This works the same as (Passenger & Airports) above, you can add to it and display it the same way
- do a PATCH on Postman with the link http://localhost:8080/passenger_repo/{id}/aircrafts
- to add an airport to the list, put http://localhost:8080/airport_repo/{id} in the body as text.
- To see the list enter GET http://localhost:8080/passenger/{id}/aircrafts
--------------------------------------------------------------------------------------------------------------------------------
Docker Container


  
