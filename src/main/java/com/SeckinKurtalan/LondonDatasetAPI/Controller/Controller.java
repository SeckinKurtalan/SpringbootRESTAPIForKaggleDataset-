package com.SeckinKurtalan.LondonDatasetAPI.Controller;

import com.SeckinKurtalan.LondonDatasetAPI.Model.House;
import com.SeckinKurtalan.LondonDatasetAPI.Service.HouseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@RestController
@RequestMapping("/house")
public class Controller {

    private final HouseService houseService;


    public Controller(HouseService houseService) {
        this.houseService = houseService;

    }


    @GetMapping("/{id}")
    public ResponseEntity<House> findById(@PathVariable int id){
        return ResponseEntity.ok(houseService.getHouseById(id));
    }

    @PostMapping
    public ResponseEntity<House> addHouse(@RequestBody House house){
        return ResponseEntity.ok(houseService.addHouse(house));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<House> deleteHouse(@PathVariable int id){
        House hs = houseService.deleteHouseById(id);
        return ResponseEntity.ok(hs);
    }


    @PutMapping("/{id}")
    public ResponseEntity<House> updateHouse(@PathVariable int id,@RequestBody House house){
            House hs = houseService.updateHouse(id,house);
            return ResponseEntity.ok(hs);
    }

    @GetMapping("/propertyName/{propertyName}")
    public ResponseEntity<List<House>> searchPropertyName(@PathVariable String propertyName){
        return ResponseEntity.ok(houseService.searchPropertyName(propertyName));

    }

    @GetMapping("/price/{price}")
    public ResponseEntity<List<House>> searchPrice(@PathVariable int price){
        return ResponseEntity.ok(houseService.searchPrice(price));

    }
    @GetMapping("/houseType/{HouseType}")
    public ResponseEntity<List<House>> searchHouseType(@PathVariable String HouseType){
        return ResponseEntity.ok(houseService.searchHouseType(HouseType));

    }
    @GetMapping("/areaInSqFt/{areaInSqFt}")
    public ResponseEntity<List<House>> searchareaInSqFt(@PathVariable int areaInSqFt){
        return ResponseEntity.ok(houseService.searchareaInSqFt(areaInSqFt));

    }
    @GetMapping("/noOfBedrooms/{noOfBedrooms}")
    public ResponseEntity<List<House>> searchnoOfBedrooms(@PathVariable int noOfBedrooms){
        return ResponseEntity.ok(houseService.searchNoOFBedrooms(noOfBedrooms));

    }
    @GetMapping("/noOfBathrooms/{noOfBathrooms}")
    public ResponseEntity<List<House>> searchNoOfBathrooms(@PathVariable int noOfBathrooms){
        return ResponseEntity.ok(houseService.searchNoOfBathrooms(noOfBathrooms));

    }
    @GetMapping("/noOfReceptions/{noOfReceptions}")
    public ResponseEntity<List<House>> searchnoOfReceptions(@PathVariable int noOfReceptions){
        return ResponseEntity.ok(houseService.searchNoOfReceptions(noOfReceptions));

    }
    @GetMapping("/location/{location}")
    public ResponseEntity<List<House>> searchlocation(@PathVariable String location){
        return ResponseEntity.ok(houseService.searchLocation(location));

    }
    @GetMapping("/CityCountry/{city_Country}")
    public ResponseEntity<List<House>> searchCity_Country(@PathVariable String city_Country){
        return ResponseEntity.ok(houseService.searchCityCountry(city_Country));

    }
    @GetMapping("/postalCode/{postalCode}")
    public ResponseEntity<List<House>> searchPostalCode(@PathVariable String postalCode){
        return ResponseEntity.ok(houseService.searchPostal_Code(postalCode));

    }

}
