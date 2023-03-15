package com.example.springcloudconfigclient.controller;

import com.example.springcloudconfigclient.config.DataAutoRefreshConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RequestMapping("/config")
@RestController
public class ConfigController {

    @Value("${data.name}")
    private String name;

    @Autowired
    private DataAutoRefreshConfig autoRefreshConfig;

    @GetMapping("/getName")
    public String getName(){
        return name;
    }

    @GetMapping("/getAutoName")
    public String getAuto(){
        return autoRefreshConfig.getName();
    }

}
