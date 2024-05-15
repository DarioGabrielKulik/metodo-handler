package com.metodohandler.metodohandler.interceptors;

import com.metodohandler.metodohandler.controllers.AddControllers;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Component("loadinInteceptors")
public class LoadingInterceptors implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(LoadingInterceptors.class);



    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //HandlerInterceptor.super.preHandle(request, response, handler);
        logger.info("LoadingInterceptors: prehandle() Entrando .....");
        long start = System.currentTimeMillis();
        request.setAttribute("Start", start);
        Random radom = new Random();
        int delay = radom.nextInt(500);
        Thread.sleep(delay);
        return  true;
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
       // HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
        HandlerMethod metodo = ((HandlerMethod) handler);
        logger.info("LoadingInterceptors: posthandle() saliendo ....." + metodo.getMethod().getName()) ;

    }

}
