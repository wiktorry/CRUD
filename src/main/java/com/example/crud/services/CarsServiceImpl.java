package com.example.crud.services;

import com.example.crud.entity.Car;
import com.example.crud.exceptions.CarException;
import com.example.crud.repositories.CarsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarsServiceImpl implements CarsService{
    private final CarsRepository carRepository;
    public CarsServiceImpl(CarsRepository carRepository){
        this.carRepository = carRepository;
    }
    @Override
    public List<Car> findAll(){
        return carRepository.findAll();
    }
    @Override
    public Car findById(int Id){
        return carRepository.findById(Id).orElseThrow(() -> new CarException("Car doesn't exist in database"));
    }
    @Override
    public Car create(Car car){
        Optional<Car> exactCar = carRepository.findByProductionYear(car.getProductionYear());
        if(exactCar.isPresent()){
            throw new CarException("Car from this production year exists");
        }
        return carRepository.save(car);
    }
    @Override
    public Car update(Car car) {
        return carRepository.save(car);
    }
    @Override
    public void deleteById(int Id) {
        carRepository.deleteById(Id);
    }
}
