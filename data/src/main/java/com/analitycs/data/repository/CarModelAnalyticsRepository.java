package com.analitycs.data.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.analitycs.data.entity.CarModelAnalyticsEntity;

public interface CarModelAnalyticsRepository extends JpaRepository<CarModelAnalyticsEntity, Long> {

    Optional<CarModelAnalyticsEntity> findByModel(String model);
}
