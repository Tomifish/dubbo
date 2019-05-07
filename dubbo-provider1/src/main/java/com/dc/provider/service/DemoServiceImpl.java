package com.dc.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.dc.sercice.DemoService;
import org.springframework.stereotype.Component;

/**
 * @ClassName DemoServiceImpl
 * @Version 1.0
 **/
@Service
@Component
public class DemoServiceImpl implements DemoService {
    @Override
    public String getDemoString() {
        System.out.println("111111");
        return "Hello Dubbo!";
    }

}
