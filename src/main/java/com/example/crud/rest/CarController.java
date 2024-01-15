package com.example.crud.rest;

import com.example.crud.entity.Car;
import com.example.crud.services.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {
    private CarService carService;
    public CarController(CarService theCarService){
        carService = theCarService;
    }
    @GetMapping("/cars")
    public List<Car> getAll(){
        return carService.findAll();
    }
}
