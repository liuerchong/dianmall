package com.liu.dianmall.goods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@MapperScan("com.liu.dianmall.user.mapper")
@EnableDiscoveryClient
@SpringBootApplication
public class GoodsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodsServiceApplication.class, args);
    }

    
   
}
