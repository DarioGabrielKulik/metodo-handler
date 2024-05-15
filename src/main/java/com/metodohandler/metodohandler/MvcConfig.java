package com.metodohandler.metodohandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Autowired
    @Qualifier("loadinInteceptors")
    private HandlerInterceptor handlerInterceptors;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
     registry.addInterceptor(handlerInterceptors).addPathPatterns("/app/foo");} // el addPathPatterns le de una ruta espesifica. / para excluir excludePathPatterns()

}
