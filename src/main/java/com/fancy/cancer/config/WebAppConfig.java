package com.fancy.cancer.config;

import com.fancy.cancer.interceptor.LoginIntercept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebAppConfig implements WebMvcConfigurer {

    @Autowired
    private LoginIntercept loginIntercept;

    /**
     * @param registry 配置静态资源放行
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    /**
     * @param registry 添加拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

//        addPathPatterns添加需要拦截的命名空间；
//        excludePathPatterns添加排除拦截命名空间

        registry.addInterceptor(loginIntercept).addPathPatterns("/**")
                .excludePathPatterns("/", "/login", "/disembark/", "/disembark/login", "/disembark/landing", "/disembark/getOut", "/js/**", "/images/**", "/css/**", "/layui245/**");
    }

}
