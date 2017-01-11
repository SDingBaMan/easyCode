package com.sdingba.Controller;

import com.sdingba.Service.InitService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by SDingBa.xiong on 17-1-10.
 */
@RestController
@RequestMapping("/api/sdingba")
public class initController {

    @Resource
    private InitService initService;

    @RequestMapping("/init")
    public String intiController() {
        System.out.println("dsfdfsdf");
        System.out.println(initService.init());
        return "initController";
    }
}
