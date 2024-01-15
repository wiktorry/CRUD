package com.example.crud.services;

import com.example.crud.entity.Car;
import com.example.crud.repositories.CarsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private final CarsRepository carRepository;
    public CarService(CarsRepository carRepository){
        this.carRepository = carRepository;
    }
    public List<Car> findAll(){
        return carRepository.findAll();
    }
    public Car findById(int Id){
         carRepository.findById(Id).;
    }
}
