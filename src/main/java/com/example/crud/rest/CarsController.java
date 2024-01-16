package com.example.crud.rest;

import com.example.crud.entity.Car;
import com.example.crud.services.CarsServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarsController {
    private CarsServiceImpl carService;
    public CarsController(CarsServiceImpl carService){
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
    @PostMapping("/cars")
    public Car addCar(@RequestBody Car car){
        car.setId(0);
        return carService.create(car);
    }
    @PutMapping("/cars")
    public Car updateCar(@RequestBody Car car){
        return carService.update(car);
    }
    @DeleteMapping("/cars/{carId}")
    public void deleteCarById(@PathVariable int carId){
        carService.deleteById(carId);
    }
}
