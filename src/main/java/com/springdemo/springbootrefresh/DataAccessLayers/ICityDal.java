package com.springdemo.springbootrefresh.DataAccessLayers;

import com.springdemo.springbootrefresh.Entities.City;

import java.io.IOException;
import java.util.List;

public interface ICityDal {
    List<City> getAll() throws IOException;
    void add(City city);
    void update(City city);
    void delete(City city);
    City getById(int id);
}
