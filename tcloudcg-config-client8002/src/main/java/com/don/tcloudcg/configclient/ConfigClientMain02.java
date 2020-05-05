package com.don.tcloudcg.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain02 {
    public static void main(String[] args)
    {
        SpringApplication.run(ConfigClientMain02.class, args);
    }
}
