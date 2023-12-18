package com.analitycs.data.service;

import org.springframework.stereotype.Service;

import com.analitycs.data.dto.CarPostDTO;

@Service
public interface PostAnalyticsService {
    
    void saveDataAnalytics(CarPostDTO carPostDTO);
}
