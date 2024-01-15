package com.example.crud.services;

import com.example.crud.entity.Car;
import com.example.crud.repositories.CarsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarsService {
    private final CarsRepository carRepository;
    public CarsService(CarsRepository carRepository){
        this.carRepository = carRepository;
    }
    public List<Car> findAll(){
        return carRepository.findAll();
    }
    public Optional<Car> findById(int Id){
         return carRepository.findById(Id);
    }
}
