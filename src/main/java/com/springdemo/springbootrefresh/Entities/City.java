package com.springdemo.springbootrefresh.Entities;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@Entity
@Table(name = "city", schema = "sakila")
public class City {
    @Id
    @Column(name = "city_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int city_id;
    @Column(name = "city", nullable = false)
    private String name;
    @Column(name = "country_id", nullable = false)
    private int country_id;
    @Column(name = "last_update", nullable = false)
    private Timestamp last_update;

    public City(int city_id, String name, int country_id) {
        this.city_id = city_id;
        this.name = name;
        this.country_id = country_id;
        this.last_update = new Timestamp(System.currentTimeMillis());
    }

    public City() {

    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public Timestamp getLast_update() {
        return last_update;
    }

    public void setLast_update(Timestamp last_update) {
        this.last_update = last_update;
    }
}
