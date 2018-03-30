package com.honvay.cola.cloud.framework.base.configuration;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.honvay.cola.cloud.framework.base.mapper.CommonMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MybatisPlus配置
 *
 * @author stylefeng
 * @Date 2017/5/20 21:58
 */
@Configuration
@Slf4j
public class MyBatisPlusInterceptorConfiguration {
    /**
     * mybatis-plus分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    @Bean
    public CommonMapper commonMapper(SqlSessionFactory sqlSessionFactory){
        log.info("Init CommonMapper");
        return new CommonMapper(sqlSessionFactory);
    }
}
