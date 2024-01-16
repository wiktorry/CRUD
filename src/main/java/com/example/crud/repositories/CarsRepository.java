package com.example.crud.repositories;

import com.example.crud.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarsRepository extends JpaRepository<Car, Integer> {
    Optional<Car> findByProductionYear(int year);
}
