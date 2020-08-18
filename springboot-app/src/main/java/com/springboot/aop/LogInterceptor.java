package com.springboot.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogInterceptor {

    @Before("execution(* com.springboot.service.EmployeeService.get*())")
    public void aopPrintBefore() {
        System.out.println("Method Started !!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @After("execution(* com.springboot.service.EmployeeService.get*())")
    public void aopPrintAfter() {
        System.out.println("Method Ended !!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
