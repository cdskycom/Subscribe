package com.ystmobile.subscribe.aop;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ystmobile.subscribe.model.ResultData;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.util.UUID;

@Aspect
@Order(0)
@Component
public class LogAspect {
    protected final org.slf4j.Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Autowired
    private Gson json;

    @Autowired
    private HttpSession session;

    @Autowired
    private HttpServletRequest request;

    @Pointcut("execution(* com.ystmobile.subscribe.controller..*.*(..))")
    public void logPointcut(){}

    @Around("logPointcut()")
    public Object logActionInformation(ProceedingJoinPoint jp) throws Throwable {
        String sessionid = session.getId();
        String uuid = UUID.randomUUID().toString();
        String header = "["+sessionid+"]["+uuid+"]";
        try{
        	
            String requestStr = request.getMethod()=="GET"?request.getQueryString():json.toJson(request.getParameterMap());
            logger.debug(header+"调用目标方法："+jp.getSignature().getDeclaringTypeName()+"."+jp.getSignature().getName());
            logger.debug(header+"方法参数："+ requestStr);
            Object returnValue = jp.proceed();
            logger.debug(header+"返回值："+ returnValue);
            return returnValue;
        }catch (Exception ex){
            logger.error(header+"执行出现异常："+ex.getMessage());
            ResultData rd = new ResultData();
            rd.setResult(ResultData.OTHER);
            rd.setMessage("请稍候再试！");
            return json.toJson(rd);
        }
    }
  
    
    
}

