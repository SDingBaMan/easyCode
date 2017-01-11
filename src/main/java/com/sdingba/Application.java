package com.sdingba;

import javax.annotation.Resource;

import com.sdingba.config.SystemConfig;
import com.sdingba.entity.active.User;
import com.sdingba.entity.crm.AdPosition;
import com.sdingba.mapper.active.UserMapper;
import com.sdingba.mapper.crm.AdPositionMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

/**
 * Author: gang.pan Date: 2016/5/3 Time: 19:22 Mail: gang.pan@htmob.cn
 */
@SpringBootApplication
@EnableCaching
@EnableScheduling
public class Application {

    @Resource
    private AdPositionMapper adPositionMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private SystemConfig systemConfig;
    // @Resource
    // private aaa aaa;

    @SuppressWarnings("squid:S2095")
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Scheduled(cron = "2/10 * * * * ?")
    public void adfad() {
        System.out.println("scsccc");
        // System.out.println(aaa.aaa());

        System.out.println(systemConfig.getDroolsName());

        List<AdPosition> positionList = adPositionMapper.selectByExample(null);
        for (AdPosition adPosition : positionList) {
            System.out.println(adPosition.getAdName());
        }

        List<User> users = userMapper.selectByExample(null);
        for (User user : users) {
            System.out.println(user.getCreateTime());
        }
    }
}
