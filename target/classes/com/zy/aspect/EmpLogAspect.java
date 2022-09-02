package com.zy.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Slf4j
@Aspect
@Component
public class EmpLogAspect {
    //pointcut 获取公共的切入点
    @Pointcut("execution(public * com.zy.controller.EmployeesController.getPageEmployees(..) )")
    public void log(){
        log.info("需要提前校验的方法");
    }

    @Before("log()")
    public void doBefore(){
        log.info("log-----Before");
    }

    @After("log()")
    public void doAfter(){
        log.info("log-----After");
    }

    //返回之后执行，并得到返回结果
    @AfterReturning(returning = "object",pointcut = "log()")
    public void doAfterReturning(Object object){
        log.info("response= {}",object.toString());
    }

    @AfterThrowing(throwing = "exception",value = "log()")
    public void doException(Exception exception){
        log.error("数据异常 ："+exception);
    }

}
