package com.harry.devweek23.domain.repoditory;

import com.harry.devweek23.domain.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
}
