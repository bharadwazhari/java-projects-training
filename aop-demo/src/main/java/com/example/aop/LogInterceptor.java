package com.example.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogInterceptor {

	@Before("execution(* com.example.aop.BusinessLogic.method*())")
	public void aopPrintBefore() {

		System.out.println("Method Execustion is Starting !!!!!!!!!!!!!!!!!!!!!!!!!!");
	}

	@After("execution(* com.example.aop.BusinessLogic.method*())")
	public void aopPrintAfter() {

		System.out.println("Method Execustion is Ending !!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
}
