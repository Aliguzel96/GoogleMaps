package com.example.travelbook.models;

import java.io.Serializable;

public class Place implements Serializable {
    public String name;
    public double latitude;
    public double longitude;


    public Place(String name, double latitude, double longitude){
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;


    }
}
