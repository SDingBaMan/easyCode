package com.sdingba.Controller;

import com.sdingba.Service.InitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * Created by SDingBa.xiong on 17-1-10.
 */
@RestController
@RequestMapping("/api/sdingba")
public class initController {
    private static final Logger LOGGER = LoggerFactory.getLogger(initController.class);
    @Inject
    private InitService initService;

    @RequestMapping("/init")
    public String intiController() {
        System.out.println("dsfdfsdf");
        System.out.println(initService.init());
        return "initController";
    }
}
