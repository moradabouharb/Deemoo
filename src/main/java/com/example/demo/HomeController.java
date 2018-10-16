package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {
    public HomeController() {
    }

    @GetMapping({"/hello"})
    public String home() {
        return "Hello";
    }

    @GetMapping({"/student"})
    public int Getage() {
        Student S = new Student("Morad", 27);
        return S.Getage();
    }

    @GetMapping({"/studentt"})
    public int Getagee(@RequestParam(name = "name") String name) {
        Student S = new Student("moaz", 22);
        return name.equals(S.name) ? S.Getagebyname(name) : 0;
    }

    @Autowired
    private ICityService cityService;

    @GetMapping({"/cities"})
    public List<City> findCities() {
        return cityService.findAll();
    }

    @GetMapping("/cities/{userId}")
    public City findCity(@PathVariable Long userId) {

        return cityService.findById(userId);
    }
}