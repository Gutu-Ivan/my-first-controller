package com.gutuivan.controller;

import com.gutuivan.repository.CountriesRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {
    CountriesRepository countriesRepository = new CountriesRepository();
    @PostMapping("countries")
    public String create(){
        return "Create country";
    }
    @GetMapping("countries/{id}")
    public String read(@PathVariable Integer id){
        return countriesRepository.read(id);
    }
    @GetMapping("countries")
    public String readAll(){
        return countriesRepository.readAll();
    }
    @PutMapping("countries")
    public String update(){
        return "Update country";
    }
    @DeleteMapping("countries")
    public String delete(){
        return "Delete country";
    }

}
