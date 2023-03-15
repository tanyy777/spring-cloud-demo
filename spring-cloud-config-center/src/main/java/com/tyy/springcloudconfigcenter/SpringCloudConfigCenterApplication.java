package com.tyy.springcloudconfigcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigCenterApplication.class, args);
    }

}
