package com.example.crud.repositories;

import com.example.crud.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarsRepository extends JpaRepository<Car, Integer> {
}
