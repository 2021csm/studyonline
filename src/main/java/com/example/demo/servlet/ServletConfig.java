package com.example.demo.servlet;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig {
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean bean=new ServletRegistrationBean(new Servlet2());
        bean.addUrlMappings("/second");
        return  bean;
    }
    @Bean
    public FilterRegistrationBean  FilterRegistrationBean(){
        FilterRegistrationBean bean=new FilterRegistrationBean(new Fiter1());
        bean.addUrlPatterns("/second");
       // bean.addUrlPatterns(new String[]{".do",".jsp"});
        return  bean;
    }
    @Bean
    public ServletListenerRegistrationBean ServletListenerRegistrationBean(){
        ServletListenerRegistrationBean bean=new ServletListenerRegistrationBean(new ListenerDemo());


        return  bean;
    }
}
