package com.example.crud.rest;

import com.example.crud.entity.Car;
import com.example.crud.services.CarsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarsController {
    private CarsService carService;
    public CarsController(CarsService carService){
        this.carService = carService;
    }
    @GetMapping("/cars")
    public List<Car> getAll(){
        return carService.findAll();
    }
    @GetMapping("/cars/{carId}")
    public Car getCarById(@PathVariable int carId){
        return carService.findById(carId).orElseThrow(()->new RuntimeException("Car not found"));
    }
    @PostMapping("/cars")
    public Car addCar(@RequestBody Car car){
        car.setId(0);
        carService.save(car);
        return car;
    }
}
