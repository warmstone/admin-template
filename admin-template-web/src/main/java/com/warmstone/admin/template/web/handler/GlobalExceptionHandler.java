package com.warmstone.admin.template.web.handler;

import com.warmstone.admin.template.common.JsonResult;
import com.warmstone.admin.template.common.exception.BizException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import javax.servlet.http.HttpServletRequest;

/**
 * @author pengshun
 * @date 2022-04-06 22:16
 * @description 全局异常处理器
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 请求参数校验异常处理
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public JsonResult<String> methodArgumentNotValidExceptionHandler(HttpServletRequest request, MethodArgumentNotValidException exception) {
        log.error("请求参数校验错误，请求方法：{}，参数：{}", exception.getParameter().getMethod().getName(), exception.getBindingResult().getFieldError().getDefaultMessage());
        return JsonResult.fail(exception.getBindingResult().getFieldError().getDefaultMessage());
    }

    /**
     * 请求参数序列化错误处理
     */
    @ExceptionHandler(value = HttpMessageNotReadableException.class)
    public JsonResult<String> httpMessageNotReadableException(HttpServletRequest request, HttpMessageNotReadableException exception) {
        log.error(exception.getMessage());
        return JsonResult.fail(exception.getMessage());
    }

    @ExceptionHandler(value = MethodArgumentTypeMismatchException.class)
    public JsonResult<String> methodArgumentTypeMismatchException(HttpServletRequest request, MethodArgumentTypeMismatchException exception) {
        log.error("参数类型错误，参数名：{}", exception.getName());
        return JsonResult.fail("参数类型错误，参数名" + exception.getName());
    }

    @ExceptionHandler(value = BindException.class)
    public JsonResult<String> bindExceptionHandler(HttpServletRequest request, BindException exception) {
        log.error("参数类型错误，参数名：{}", exception.getBindingResult());
        return JsonResult.fail("参数类型错误");
    }

    @ExceptionHandler(BizException.class)
    public JsonResult<String> bizExceptionHandler(BizException e) {
        log.info("捕获业务异常: {}", e.getMessage());
        return JsonResult.fail(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public JsonResult<String> exceptionHandler(Exception e) {
        log.info("捕获未定义异常: {}", e.getMessage());
        return JsonResult.fail(e.getMessage());
    }


}
