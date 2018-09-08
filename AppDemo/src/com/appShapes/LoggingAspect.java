package com.appShapes;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	/*@Before("circleGetName()")
	public void loggingAdvice()
	{
		System.out.println("Advice executed");
	}
	@After("circleGetName()")
	public void loggingAdviceAfter()
	{
		System.out.println("after Advice executed");
	}
	//@Pointcut("execution(public string com.appShapes.Circle.getName())")
	
	
	*/
	//@AfterThrowing
	//@AfterReturning
	@Pointcut("within(com.appShapes.Circle)")
	public void circleGetName() {}
	Object obj;
	@Around("circleGetName()")
	public Object aroundAdvice(ProceedingJoinPoint jp) {
		System.out.println("Before Execution of method");
		try {
			
			obj= jp.proceed();
			System.out.println("Afte execution of method");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
		
	}
	
}
