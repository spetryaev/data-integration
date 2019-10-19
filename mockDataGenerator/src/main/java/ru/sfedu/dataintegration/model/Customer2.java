package ru.sfedu.dataintegration.model;

import com.opencsv.bean.CsvBindByName;

public class Customer2 {
    @CsvBindByName
    private String trafficVolumeMB;
    @CsvBindByName
    private String date;
    @CsvBindByName
    private String address;

    public Customer2() {
    }

    public Customer2(String trafficVolumeMB, String date, String address) {
        this.trafficVolumeMB = trafficVolumeMB;
        this.date = date;
        this.address = address;
    }

    public String getTrafficVolumeMB() {
        return trafficVolumeMB;
    }

    public void setTrafficVolumeMB(String trafficVolumeMB) {
        this.trafficVolumeMB = trafficVolumeMB;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
