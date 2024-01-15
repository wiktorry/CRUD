package com.example.crud.rest;

import com.example.crud.entity.Car;
import com.example.crud.services.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {
    private CarService carService;
    public CarController(CarService carService){
        this.carService = carService;
    }
    @GetMapping("/cars")
    public List<Car> getAll(){
        return carService.findAll();
    }
    @GetMapping("/cars/{carId}")
    public Car getCarById(@PathVariable int carId){
        return carService.findById(carId);
    }
}
