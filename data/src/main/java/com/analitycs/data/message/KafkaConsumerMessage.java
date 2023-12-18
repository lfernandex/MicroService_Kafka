package com.analitycs.data.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.analitycs.data.dto.CarPostDTO;
import com.analitycs.data.service.PostAnalyticsService;

@Component
public class KafkaConsumerMessage {

    private final Logger LOG = LoggerFactory.getLogger(KafkaConsumerMessage.class);

    @Autowired
    private PostAnalyticsService postAnalyticsService;

    @KafkaListener(topics = "car-post-topic", groupId = "analytics-posts-group")
    public void listening(@PathVariable CarPostDTO carPost) {
        System.out.println("Received Car Post information: " + carPost);
        LOG.info("ANALYTICS DATA - Received Car Post Information : {}", carPost);
        postAnalyticsService.saveDataAnalytics(carPost);
    }
}
