package com.server.restserver.rest_controller;


import com.server.restserver.service.SimpleHorsePowerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Consumer;

@RestController
@RequestMapping ("nalog/")
public class FirstController {

    SimpleHorsePowerProvider simpleHorsePowerProvider;

    @Autowired
    public FirstController (SimpleHorsePowerProvider simpleHorsePowerProvider) {
        this.simpleHorsePowerProvider = simpleHorsePowerProvider;
    }


    @GetMapping("{horsepower}")
    public String horsepower(@PathVariable String horsepower) {
        return simpleHorsePowerProvider.provideHorsePower(horsepower);
    }


//    Consumer consumer;

}
