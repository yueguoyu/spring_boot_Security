package com.ygy.Config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

/**
 * @date 2017/12/5
 * datasource bean
 */
@ComponentScan
@Configuration
public class dataSource {
    @Value("${spring.datasource.name}")
    private String name;
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;

    @Bean(name = "myDataSource")
    public DataSource getdataSource() {
        DruidDataSource source = new DruidDataSource();
        source.setUrl(url);
        source.setUsername(username);
        source.setPassword(password);
        return source;
    }
}
