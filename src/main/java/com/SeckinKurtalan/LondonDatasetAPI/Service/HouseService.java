package com.SeckinKurtalan.LondonDatasetAPI.Service;

import com.SeckinKurtalan.LondonDatasetAPI.Exception.HouseNotFoundException;
import com.SeckinKurtalan.LondonDatasetAPI.Model.House;
import com.SeckinKurtalan.LondonDatasetAPI.Repository.HouseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseService {


    private final HouseRepository houseRepository;


    public HouseService(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    public House getHouseById(Integer id){
        return houseRepository.findById(id).orElseThrow(()->new HouseNotFoundException("House Couldn't Find For The Id = " + id));
    }


    public House addHouse(House house) {
        House hs = houseRepository.save(house);
        System.out.println(hs);
        return hs;
    }

    public House deleteHouseById(int id) {
        House house = getHouseById(id);
        houseRepository.delete(house);
        return house;
    }

    public House updateHouse(int id, House house) {
        House houseToUpdate = getHouseById(id);
        houseToUpdate.updateHouse(house);
        houseRepository.save(houseToUpdate);
        return houseToUpdate;
    }

    public List<House> searchPropertyName(String propertyName) {
       return houseRepository.findBypropertyNameStartingWith(propertyName);
    }

    public List<House> searchPrice(int price) {
        return houseRepository.findByprice(price);
    }
    public List<House> searchHouseType(String houseType) {
        return houseRepository.findByhouseTypeStartingWith(houseType);
    }

    public List<House> searchareaInSqFt(int areaInSqFt) {
        return houseRepository.findByareaInSqFt(areaInSqFt);
    }
    public List<House> searchNoOFBedrooms(int noOfBedrooms) {
        return houseRepository.findBynoOfBedrooms(noOfBedrooms);
    }
    public List<House> searchNoOfBathrooms(int noOfBathrooms) {
        return houseRepository.findBynoOfBathrooms(noOfBathrooms);
    }
    public List<House> searchNoOfReceptions(int noOfReceptions) {
        return houseRepository.findBynoOfReceptions(noOfReceptions);
    }
    public List<House> searchLocation(String location) {
        return houseRepository.findBylocationStartingWith(location);
    }
    public List<House> searchCityCountry(String city_Country) {
        return houseRepository.findByCityCountryStartingWith(city_Country);
    }
    public List<House> searchPostal_Code(String postalCode) {
        return houseRepository.findBypostalCodeStartingWith(postalCode);
    }
}
