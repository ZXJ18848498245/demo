package com.zxj.springboot_quick3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootQuick3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootQuick3Application.class, args);
    }

}
