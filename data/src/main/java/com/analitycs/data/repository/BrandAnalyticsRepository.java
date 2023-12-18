package com.analitycs.data.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.analitycs.data.entity.BrandAnalyticsEntity;

public interface BrandAnalyticsRepository extends JpaRepository<BrandAnalyticsEntity, Long> {
    Optional<BrandAnalyticsEntity> findByBrand(String brand);

}
