package com.learning.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingMethodAspect {

    private Logger logger = LoggerFactory.getLogger(LoggingMethodAspect.class);

    @Around("@annotation(com.learning.annotation.LogMethodExecution)")
    public Object logMethodExecution(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Method execution started for {}", joinPoint.getSignature().getName());
        Object proceed = joinPoint.proceed();
        logger.info("Method execution completed for {}", joinPoint.getSignature().getName());
        return proceed;
    }
}