package com.devlogs.apolo.osg.api.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class AuthServiceInterceptorConfig extends WebMvcConfigurerAdapter {
    @Autowired
    AuthServiceInterceptor authServiceInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authServiceInterceptor).addPathPatterns("/**").excludePathPatterns("/api/v1/status/**").excludePathPatterns("/api/v1/quickquestion/**");
    }
}
