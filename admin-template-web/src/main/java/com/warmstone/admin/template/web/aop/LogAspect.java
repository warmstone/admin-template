package com.warmstone.admin.template.web.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author pengshun
 * @date 2022-04-10 17:20
 * @description
 */
@Aspect
@Configuration
public class LogAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 日志切点
     */
    @Pointcut(value = "execution(public * com.warmstone.admin.template.web.controller.*.* (*))")
    public void log() {}

    @Around(value = "log()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        LogEntity logEntity = new LogEntity();
        logEntity.setStartTime(System.currentTimeMillis());
        logEntity.setUrl(request.getRequestURL().toString());
        logEntity.setHttpMethod(request.getMethod());
        logEntity.setClazzMethod(joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logEntity.setRequestParams(joinPoint.getArgs());
        Object result = joinPoint.proceed();
        logEntity.setResponseResult(result);
        logEntity.setEndTime(System.currentTimeMillis());
        logger.info(logEntity.toString());
        return result;
    }

    private class LogEntity {
        private Long startTime;
        private String url;
        private String httpMethod;
        private String clazzMethod;
        private String ip;
        private Object requestParams;
        private Object responseResult;
        private Long endTime;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHttpMethod() {
            return httpMethod;
        }

        public void setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
        }

        public String getClazzMethod() {
            return clazzMethod;
        }

        public void setClazzMethod(String clazzMethod) {
            this.clazzMethod = clazzMethod;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public Object getRequestParams() {
            return requestParams;
        }

        public void setRequestParams(Object requestParams) {
            this.requestParams = requestParams;
        }

        public Object getResponseResult() {
            return responseResult;
        }

        public void setResponseResult(Object responseResult) {
            this.responseResult = responseResult;
        }

        public Long getStartTime() {
            return startTime;
        }

        public void setStartTime(Long startTime) {
            this.startTime = startTime;
        }

        public Long getEndTime() {
            return endTime;
        }

        public void setEndTime(Long endTime) {
            this.endTime = endTime;
        }

        @Override
        public String toString() {
            return "LogEntity{" +
                    "startTime=" + startTime +
                    ", url='" + url + '\'' +
                    ", httpMethod='" + httpMethod + '\'' +
                    ", clazzMethod='" + clazzMethod + '\'' +
                    ", ip='" + ip + '\'' +
                    ", requestParams=" + requestParams +
                    ", responseResult=" + responseResult +
                    ", endTime=" + endTime +
                    ", time-consuming=" + (startTime - endTime) +
                    '}';
        }
    }

}
