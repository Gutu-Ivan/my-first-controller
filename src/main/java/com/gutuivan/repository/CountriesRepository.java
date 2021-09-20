package com.gutuivan.repository;


public class CountriesRepository {

    String [] countries = {"Moldova", "Ukraine", "Romania"};
    public String create(){
        return "Get country";
    }
    public String read(Integer id){
        return id + ":" + this.countries[id];
    }
    public String readAll(){
        return this.countries.toString();
    }
    public String update(){
        return "Get country";
    }
    public String delete(){
        return "Get country";
    }
}
