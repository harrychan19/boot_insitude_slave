package com.hsh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hushihai
 * @version V1.0, 2018/11/6
 */
@SpringBootApplication
@EnableAutoConfiguration
public class BootInsitudeSlaveApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootInsitudeSlaveApplication.class,args);
    }
}
