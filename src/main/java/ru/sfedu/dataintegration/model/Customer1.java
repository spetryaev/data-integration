package ru.sfedu.dataintegration.model;

import com.opencsv.bean.CsvBindByName;

public class Customer1 {
    @CsvBindByName
    private String accountName;
    @CsvBindByName
    private String trafficVolumeKB;
    @CsvBindByName
    private String date;
    @CsvBindByName
    private String city;
    @CsvBindByName
    private String street;
    @CsvBindByName
    private String house;

    public Customer1() {
    }

    public Customer1(String accountName, String trafficVolumeKB, String date, String city, String street, String house) {
        this.accountName = accountName;
        this.trafficVolumeKB = trafficVolumeKB;
        this.date = date;
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getTrafficVolumeKB() {
        return trafficVolumeKB;
    }

    public void setTrafficVolumeKB(String trafficVolumeKB) {
        this.trafficVolumeKB = trafficVolumeKB;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }
}
