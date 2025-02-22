package com.drifter.spring_6_cool_service.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {
    public static final String DRINK_REQUEST_COOL_TOPIC = "drink.request.cool";
    public static final String DRINK_PREPARED_TOPIC = "drink.prepared";
}
