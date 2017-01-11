package com.sdingba.Service.Impl;

import com.sdingba.Service.InitService;
import org.springframework.stereotype.Service;

/**
 * Created by SDingBa.xiong on 17-1-10.
 */
@Service
public class InitServiceImpl implements InitService {
    @Override
    public String init() {
        System.out.println("cdcdcccdc");
        return "";
    }
}
