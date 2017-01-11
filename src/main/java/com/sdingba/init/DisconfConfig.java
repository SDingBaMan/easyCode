package com.sdingba.init;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baidu.disconf.client.DisconfMgrBean;
import com.baidu.disconf.client.DisconfMgrBeanSecond;

@Configuration
public class DisconfConfig {

    @Bean(name = "disconfMgrBean", destroyMethod = "destroy")
    public DisconfMgrBean getDisconfMgrBean() {
        DisconfMgrBean bean = new DisconfMgrBean();
        bean.setScanPackage("com.sdingba.config");
        return bean;
    }

    @Bean(name = "disconfMgrBean2", initMethod = "init", destroyMethod = "destroy")
    public DisconfMgrBeanSecond getDisconfMgrBeanSecond() {
        return new DisconfMgrBeanSecond();
    }

}
