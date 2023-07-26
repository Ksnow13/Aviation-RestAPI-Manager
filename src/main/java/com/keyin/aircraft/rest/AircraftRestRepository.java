package com.keyin.aircraft.rest;


import com.keyin.aircraft.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "aircraft_repo", path = "aircraft_repo")
public interface AircraftRestRepository extends JpaRepository<Aircraft, Long> {

    public List<Aircraft> findByAirLine(@Param("airLine")String airLine);
    public List<Aircraft> findByType(@Param("type")String type);

    // this gets a list of aircraft's that can land/take off from an airport.
    public List<Aircraft> findByAirports_name(@Param("airports_name")String airportName);

}