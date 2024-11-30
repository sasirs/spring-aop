/**
 * @author sasi
 *
 */
package com.sasi.spring.aop.spring_aop_example.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 
 */

@Aspect
@Component

public class LoggingAspect {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Before("execution(* com.sasi.spring.aop.spring_aop_example.service.EmployeeService.*(..))")
	public void logBeforeAllMethods(JoinPoint joinPoint) {
		LOGGER.debug("****LoggingAspect.logBeforeAllMethods() : " + joinPoint.getSignature().getName());
	}

	@Before("execution(* com.sasi.spring.aop.spring_aop_example.service.EmployeeService.getEmployeeById(..))")
	public void logBeforeGetEmployee(JoinPoint joinPoint) {
		LOGGER.debug("****LoggingAspect.logBeforeGetEmployee() : " + joinPoint.getSignature().getName());
	}

	@Before("execution(* com.sasi.spring.aop.spring_aop_example.service.EmployeeService.createEmployee(..))")
	public void logBeforeAddEmployee(JoinPoint joinPoint) {
		LOGGER.debug("****LoggingAspect.logBeforeCreateEmployee() : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.sasi.spring.aop.spring_aop_example.service.EmployeeService.*(..))")
	public void logAfterAllMethods(JoinPoint joinPoint) {
		LOGGER.debug("****LoggingAspect.logAfterAllMethods() : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.sasi.spring.aop.spring_aop_example.service.EmployeeService.getEmployeeById(..))")
	public void logAfterGetEmployee(JoinPoint joinPoint) {
		LOGGER.debug("****LoggingAspect.logAfterGetEmployee() : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.sasi.spring.aop.spring_aop_example.service.EmployeeService.addEmployee(..))")
	public void logAfterAddEmployee(JoinPoint joinPoint) {
		LOGGER.debug("****LoggingAspect.logAfterCreateEmployee() : " + joinPoint.getSignature().getName());
	}

}
