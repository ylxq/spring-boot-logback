package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class Application {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    @ResponseBody
    String home() {
        logger.info("infoMesage");
        logger.debug("debugMesage");
        logger.error("errorMesage");
        logger.warn("warnMesage");
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
