package com.analitycs.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.analitycs.data.entity.CarModelPriceEntity;

public interface CarPriceAnalyticsRepository extends JpaRepository<CarModelPriceEntity, Long> {

}
