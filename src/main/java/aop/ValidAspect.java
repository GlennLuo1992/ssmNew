package aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.validation.ObjectError;

@Component
@Aspect
public class ValidAspect {
    private ObjectError error;

    private final Logger logger = Logger.getLogger(ValidAspect.class);


    /**
     * 切点
     */
    @Pointcut("execution(public * controller.*.*(..))")
    public void valid() {
    }

    /**
     * @param pjp
     * @return
     */
    @Around("valid()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        logger.info("!!!!!!!!");
        return pjp.proceed();
    }
}