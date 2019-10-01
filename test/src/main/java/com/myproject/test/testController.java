package com.myproject.test;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex01")
public class testController {

	private static final Logger logger = LoggerFactory.getLogger(testController.class);
    
    @RequestMapping("/doA")
    public void doA(){
        logger.info("test complete!");
    }


}
