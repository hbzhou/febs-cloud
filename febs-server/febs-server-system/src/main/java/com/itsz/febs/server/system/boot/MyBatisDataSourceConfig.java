package com.itsz.febs.server.system.boot;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(value = {
        "com.itsz.febs.server.system.modules.dept.mapper",
        "com.itsz.febs.server.system.modules.user.mapper",
        "com.itsz.febs.server.system.modules.menu.mapper",
        "com.itsz.febs.server.system.modules.role.mapper"

}, sqlSessionFactoryRef = "mySqlSessionFactory")
public class MyBatisDataSourceConfig {


    @Bean("mySqlSessionFactory")
    public SqlSessionFactory createSessionFactory(@Autowired DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mapper/**/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }


}
