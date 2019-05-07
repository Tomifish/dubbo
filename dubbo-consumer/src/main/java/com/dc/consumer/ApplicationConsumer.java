package com.dc.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @ClassName ApplicationProvider
 * @Version 1.0
 **/
@SpringBootApplication
@ComponentScan("com.dc")
@EnableDubboConfiguration
@ImportResource(locations= {"classpath:spring-consumer.xml"})
public class ApplicationConsumer {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationConsumer.class, args);
//        try{
//            System.in.read();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
    }
}
