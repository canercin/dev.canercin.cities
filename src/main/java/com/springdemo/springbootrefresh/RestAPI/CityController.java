package com.springdemo.springbootrefresh.RestAPI;

import com.springdemo.springbootrefresh.BusinessService.ICityService;
import com.springdemo.springbootrefresh.Entities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CityController {
    private ICityService cityService;
    @Autowired
    public CityController(ICityService cityService) {
        this.cityService = cityService;
    }
    @GetMapping("/cities")
    public List<City> get() throws IOException {
        return this.cityService.getAll();
    }
    @PostMapping("/add")
    public void add(@RequestBody City city){
        cityService.add(city);
    }

    @PostMapping("/update")
    public void update(@RequestBody City city){
        cityService.update(city);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody City city){
        cityService.delete(city);
    }

    @GetMapping("/cities/{id}")
    public City getCity_Id(@PathVariable int id) throws IOException {
        return this.cityService.getById(id);
    }
}
