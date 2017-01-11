package com.sdingba.config;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;

/**
 * Author: gang.pan Date: 6/6/16 Time: 17:07 Mail: gang.pan@htmob.cn
 */
@Service
@Scope("singleton")
@DisconfFile(filename = "config.properties")
public class SystemConfig {

    // 作弊参数
    private String redisIp;
    private String redisPassword;
    private Integer redisPort;
    private String downloadPath;
    private String toutiaoAdUser;
    private String toutiaoAdPass;
    private String toutiaoMediaSource;
    private String ucAdUser;
    private String ucAdPass;
    private String ucMediaSource;
    private String ucAdOrder;

    private String toutiaoAdOrder;
    private String adChart;
    private String creativeChart;
    private String sohuAdUser;
    private String sohuAdPass;
    private String sohuAdOrder;
    private String sohuMediaSource;

    private String youkuAdUser;
    private String youkuAdPass;
    private String youkuAdOrder;
    private String youkuAdMediaSource;


    private String droolsName;
    private String droolsWhen;
    private String droolsThen;
    private String droolsIf;

    private String materialMediasource;
    private String mailNotice;
    private String spiderEnv;

    @DisconfFileItem(name = "youku.ad.user")
    public String getYoukuAdUser() {
        return youkuAdUser;
    }

    @DisconfFileItem(name = "youku.ad.pass")
    public String getYoukuAdPass() {
        return youkuAdPass;
    }

    @DisconfFileItem(name = "youku.ad.order")
    public String getYoukuAdOrder() {
        return youkuAdOrder;
    }

    @DisconfFileItem(name = "youku.ad.media")
    public String getYoukuAdMediaSource() {
        return youkuAdMediaSource;
    }

    @DisconfFileItem(name = "spider.env")
    public String getSpiderEnv() {
        return spiderEnv;
    }

    @DisconfFileItem(name = "mail.notice")
    public String getMailNotice() {
        return mailNotice;
    }

    @DisconfFileItem(name = "uc.ad.user")
    public String getUcAdUser() {
        return ucAdUser;
    }

    @DisconfFileItem(name = "uc.ad.pass")
    public String getUcAdPass() {
        return ucAdPass;
    }

    @DisconfFileItem(name = "uc.ad.media")
    public String getUcMediaSource() {
        return ucMediaSource;
    }

    @DisconfFileItem(name = "uc.ad.order")
    public String getUcAdOrder() {
        return ucAdOrder;
    }

    @DisconfFileItem(name = "material.mediasource")
    public String getMaterialMediasource() {
        return materialMediasource;
    }

    @DisconfFileItem(name = "drools.then")
    public String getDroolsThen() {
        return droolsThen;
    }

    @DisconfFileItem(name = "drools.if")
    public String getDroolsIf() {
        return droolsIf;
    }

    @DisconfFileItem(name = "drools.name")
    public String getDroolsName() {
        return droolsName;
    }

    @DisconfFileItem(name = "drools.when")
    public String getDroolsWhen() {
        return droolsWhen;
    }

    @DisconfFileItem(name = "sohu.ad.order")
    public String getSohuAdOrder() {
        return sohuAdOrder;
    }

    @DisconfFileItem(name = "sohu.ad.media")
    public String getSohuMediaSource() {
        return sohuMediaSource;
    }

    @DisconfFileItem(name = "sohu.ad.user")
    public String getSohuAdUser() {
        return sohuAdUser;
    }

    @DisconfFileItem(name = "sohu.ad.pass")
    public String getSohuAdPass() {
        return sohuAdPass;
    }

    @DisconfFileItem(name = "toutiao.ad.media")
    public String getToutiaoMediaSource() {
        return toutiaoMediaSource;
    }

    @DisconfFileItem(name = "toutiao.ad.order")
    public String getToutiaoAdOrder() {
        return toutiaoAdOrder;
    }

    @DisconfFileItem(name = "creative.chart")
    public String getCreativeChart() {
        return creativeChart;
    }

    @DisconfFileItem(name = "ad.chart")
    public String getAdChart() {
        return adChart;
    }

    @DisconfFileItem(name = "toutiao.ad.user")
    public String getToutiaoAdUser() {
        return toutiaoAdUser;
    }

    @DisconfFileItem(name = "toutiao.ad.pass")
    public String getToutiaoAdPass() {
        return toutiaoAdPass;
    }

    @DisconfFileItem(name = "download.path")
    public String getDownloadPath() {
        return downloadPath;
    }

    @DisconfFileItem(name = "redis.ip")
    public String getRedisIp() {
        return redisIp;
    }

    @DisconfFileItem(name = "redis.port")
    public Integer getRedisPort() {
        return redisPort;
    }

    @DisconfFileItem(name = "redis.password")
    public String getRedisPassword() {
        return redisPassword;
    }

}
