package com.wq.springboot.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName MyBatisConfig
 * @Description: 自定义MyBatis的配置规则；给容器中添加一个ConfigurationCustomizer；
 * @Author wangqing
 * @Date 2020/2/1
 * @Version V1.0
 **/
@org.springframework.context.annotation.Configuration
public class MyBatisConfig {

    @Bean
    public ConfigurationCustomizer configurationCustomizer() {
        return new ConfigurationCustomizer() {

            @Override
            public void customize(Configuration configuration) {
                //MyBatis映射数据库表字段驼峰标识
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }
}
