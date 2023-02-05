package com.SeckinKurtalan.LondonDatasetAPI.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "house_prices_in_london_copy")
public class House {

    /*SEQUENCE,generator = "product_generator")
    @SequenceGenerator(name = "product_generator",sequenceName = "product_sequence_name",allocationSize = 1)
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   @Column(name = "PropertyName")
    private String propertyName;
   @Column(name = "Price")
   private int price;
   @Column(name = "HouseType")
   private String houseType;
   @Column(name = "AreaInSqFt")
   private int areaInSqFt;
   @Column(name = "NoOfBedrooms")
   private int noOfBedrooms;
   @Column(name = "NoOfBathrooms")
   private int noOfBathrooms;
   @Column(name = "NoOfReceptions")
   private int noOfReceptions;
   @Column(name = "Location")
   private String location;
   @Column(name = "CityCounty")
   private String cityCountry;
   @Column(name = "PostalCode")
   private String postalCode;


    public House() {
    }

    @Override
    public String toString() {
        return "House{" +
                "index=" + id +
                ", propertyName='" + propertyName + '\'' +
                ", price=" + price +
                ", houseType='" + houseType + '\'' +
                ", areaInSqFt=" + areaInSqFt +
                ", noOfBedrooms=" + noOfBedrooms +
                ", noOfBathrooms=" + noOfBathrooms +
                ", noOfReceptions=" + noOfReceptions +
                ", location='" + location + '\'' +
                ", cityCountry='" + cityCountry + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }


    public House(String propertyName, int price, String houseType, int areaInSqFt, int noOfBedrooms, int noOfBathrooms, int noOfReceptions, String location, String cityCountry, String postalCode) {
        this.propertyName = propertyName;
        this.price = price;
        this.houseType = houseType;
        this.areaInSqFt = areaInSqFt;
        this.noOfBedrooms = noOfBedrooms;
        this.noOfBathrooms = noOfBathrooms;
        this.noOfReceptions = noOfReceptions;
        this.location = location;
        this.cityCountry = cityCountry;
        this.postalCode = postalCode;
    }

    public House updateHouse(House house){
        this.propertyName = house.getPropertyName();
        this.price = house.getPrice();
        this.houseType = house.getHouseType();
        this.areaInSqFt = house.getAreaInSqFt();
        this.noOfBedrooms = house.getNoOfBedrooms();
        this.noOfBathrooms = house.getNoOfBathrooms();
        this.noOfReceptions = house.getNoOfReceptions();
        this.location = house.getLocation();
        this.cityCountry = house.getcityCountry();
        this.postalCode = house.getPostalCode();
        return this;
    }


    public int getIndex() {
        return id;
    }

    public void setIndex(int index) {
        this.id = index;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public int getAreaInSqFt() {
        return areaInSqFt;
    }

    public void setAreaInSqFt(int areaInSqFt) {
        this.areaInSqFt = areaInSqFt;
    }

    public int getNoOfBedrooms() {
        return noOfBedrooms;
    }

    public void setNoOfBedrooms(int noOfBedrooms) {
        this.noOfBedrooms = noOfBedrooms;
    }

    public int getNoOfBathrooms() {
        return noOfBathrooms;
    }

    public void setNoOfBathrooms(int noOfBathrooms) {
        this.noOfBathrooms = noOfBathrooms;
    }

    public int getNoOfReceptions() {
        return noOfReceptions;
    }

    public void setNoOfReceptions(int noOfReceptions) {
        this.noOfReceptions = noOfReceptions;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getcityCountry() {
        return cityCountry;
    }

    public void setcityCountry(String cityCountry) {
        this.cityCountry = cityCountry;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
