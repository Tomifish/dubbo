package com.dc.provider;

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
//@EnableDubboConfiguration
@ImportResource(locations= {"classpath:spring-provider.xml"})
public class ApplicationProvider {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationProvider.class, args);
//        try{
//            System.in.read();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
    }
}
