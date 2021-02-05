package example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import javax.xml.ws.WebServiceContext;

@Component
@Aspect
public class TestAop {

    private WebServiceContext webServiceContext;

    @Pointcut("@annotation(example.annotation.MyAnnotation)")
    private void pointcut(){

    }

    @Before("pointcut()")
    private void before(JoinPoint joinPoint) throws Throwable {
        System.out.println("before");
       // joinPoint.proceed();
    }

    @Around("pointcut()")
    private Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around");
        return joinPoint.proceed();
    }

    @After("pointcut()")
    private void after(){
        System.out.println("after");
    }

}
