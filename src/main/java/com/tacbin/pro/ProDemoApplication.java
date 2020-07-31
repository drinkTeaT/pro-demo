package com.tacbin.pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author EDZ
 * @description
 * @date 2020/7/30 10:01
 */
@SpringBootApplication
@EnableSwagger2
public class ProDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProDemoApplication.class, args);
    }
}

