package com.dc.consumer.service;

import com.dc.sercice.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DemoController
 * @Version 1.0
 **/
@RestController
@RequestMapping("/demo")
public class DemoController {
    private static Logger logger = LoggerFactory.getLogger(DemoController.class);
    @Autowired
    private DemoService  demoService;
    @RequestMapping("/test")
    public String test(){
        logger.info("9093消费者服务调用开始");
        return demoService.getDemoString();
    }
}
