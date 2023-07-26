package com.keyin.passenger.rest;

import com.keyin.airport.Airport;
import com.keyin.passenger.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "passenger_repo", path = "passenger_repo")
public interface PassengerRestRepository extends JpaRepository<Passenger, Long> {

    public List<Passenger> findByFirstName(@Param("firstName")String firstName);
    public List<Passenger> findByLastName(@Param("lastName")String lastName);
    public List<Passenger> findByPhoneNumber(@Param("phoneNumber")String phoneNumber);

    // returns all passengers from the city searched
    public List<Passenger> findByCity_name(@Param("city_name")String cityName);

    // returns all passengers that visited the airport searched
    public List<Passenger> findByAirports_name(@Param("airport_name")String airportName);

    // returns all passengers that has been on the aircraft searched
    public List<Passenger> findByAircrafts_type(@Param("aircrafts_type")String aircraftType);
}
