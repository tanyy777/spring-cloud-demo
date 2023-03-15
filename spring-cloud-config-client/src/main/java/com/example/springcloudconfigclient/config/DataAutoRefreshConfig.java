package com.example.springcloudconfigclient.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "data")
public class DataAutoRefreshConfig {

    private String name;
}
