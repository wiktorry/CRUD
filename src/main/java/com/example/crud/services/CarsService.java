package com.example.crud.services;

import com.example.crud.entity.Car;

import java.util.List;
import java.util.Optional;

public interface CarsService {
    List<Car> findAll();
    Optional<Car> findById(int Id);
    Car create(Car car);
    Car update(Car car);
    void deleteById(int Id);
}
