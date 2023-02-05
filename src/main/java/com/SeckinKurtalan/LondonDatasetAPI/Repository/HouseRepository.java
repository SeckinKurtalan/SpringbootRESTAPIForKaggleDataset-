package com.SeckinKurtalan.LondonDatasetAPI.Repository;

import com.SeckinKurtalan.LondonDatasetAPI.Model.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HouseRepository extends JpaRepository<House,Integer> {

    List<House> findBypropertyNameStartingWith(String propertyName);

    List<House> findByprice(int price);
    List<House> findByhouseTypeStartingWith(String houseType);
    List<House> findByareaInSqFt(int areaInSqFt);

    List<House> findBynoOfBedrooms(int noOfBedrooms);
    List<House> findBynoOfBathrooms(int bathrooms);
    List<House> findBylocationStartingWith(String location);
    List<House> findByCityCountryStartingWith(String city_Country);
    List<House> findBypostalCodeStartingWith(String postalCode);

    List<House> findBynoOfReceptions(int noOfReceptions);



}
