package com.sdingba;

import javax.annotation.Resource;

import com.sdingba.config.SystemConfig;
import com.sdingba.mapper.AdPositionMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Author: gang.pan Date: 2016/5/3 Time: 19:22 Mail: gang.pan@htmob.cn
 */
@SpringBootApplication
@EnableCaching
@EnableScheduling
public class Application {

     @Resource
     private AdPositionMapper adPositionMapper;
    //    @Inject
//    private InitService initService;
    @Resource
    private SystemConfig systemConfig;
//    @Resource
//    private aaa aaa;

    @SuppressWarnings("squid:S2095")
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Scheduled(cron = "2/10 * * * * ?")
    public void adfad() {
        System.out.println("scsccc");
//        System.out.println(aaa.aaa());

         System.out.println(systemConfig.getDroolsName());

//         List<AdPosition> positionList = adPositionMapper.selectByExample(null);
//         for (AdPosition adPosition : positionList) {
//         System.out.println(adPosition.getAdName());
//         }
    }

}
