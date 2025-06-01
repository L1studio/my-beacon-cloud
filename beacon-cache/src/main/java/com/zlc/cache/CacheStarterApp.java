package com.zlc.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zjw
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CacheStarterApp {

    public static void main(String[] args) {
        SpringApplication.run(CacheStarterApp.class,args);
    }

}
