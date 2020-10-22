package com.uff.trab.projetodeSoftware.controllers;

import com.uff.trab.projetodeSoftware.models.ModelExample;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ControllerExample {
    @GetMapping("/")
    public String example (){

        return "Hello World";
    }
}
