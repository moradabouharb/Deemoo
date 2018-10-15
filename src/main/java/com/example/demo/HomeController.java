//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
