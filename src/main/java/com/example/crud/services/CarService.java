package com.example.crud.services;

import com.example.crud.entity.Car;
import com.example.crud.repositories.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private CarRepository carRepository;
    public CarService(CarRepository theCarRepository){
        carRepository = theCarRepository;
    }
    public List<Car> findAll(){
        return carRepository.findAll();
    }
}
