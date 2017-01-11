package com.sdingba.init;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.data.transaction.ChainedTransactionManager;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

/**
 * Author: gang.pan Date: 20/12/2016 Time: 13:43 Mail: gang.pan@htmob.cn
 */
@Configuration
@EnableTransactionManagement
public class MybatisConfig implements TransactionManagementConfigurer {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.crmdb")
    public DataSource crmDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.activedb")
    public DataSource activeDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean() {
        try {
            ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
            bean.setDataSource(activeDataSource());
            bean.setConfigLocation(resolver.getResource("classpath:mybatis-config.xml"));
            bean.setMapperLocations(resolver.getResources("classpath:mybatis/active/*.xml"));
            bean.setTypeAliasesPackage("com.sdingba.entity.active");
            return bean.getObject();
        } catch (Exception e) {
            throw new IllegalStateException("Init sqlSessionFactory failed!", e);
        }
    }

    @Bean(name = "sqlSessionFactoryCrm")
    public SqlSessionFactory sqlSessionFactoryCrm() {
        try {
            ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
            bean.setDataSource(crmDataSource());
            bean.setConfigLocation(resolver.getResource("classpath:mybatis-config.xml"));
            bean.setMapperLocations(resolver.getResources("classpath:mybatis/crm/*.xml"));
            bean.setTypeAliasesPackage("com.sdingba.entity.crm");
            return bean.getObject();
        } catch (Exception e) {
            throw new IllegalStateException("Init sqlSessionFactory failed!", e);
        }
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean
    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        DataSourceTransactionManager crm = new DataSourceTransactionManager(crmDataSource());
        DataSourceTransactionManager ops = new DataSourceTransactionManager(activeDataSource());
        return new ChainedTransactionManager(crm, ops);
    }

}
