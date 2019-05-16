package com.hky.exception.controller;


import com.hky.exception.entity.ResponseData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * 全局捕捉异常类
 * 2019-05-08
 */
@RestControllerAdvice
public class GlobalDefaultExceptionHandler {

    private static Logger logger = LoggerFactory.getLogger(GlobalDefaultExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    public ResponseData exceptionHandler(Exception e){
        logger.error("global error = {}",e);
        return new ResponseData(500,"异常",e.getMessage());
    }


}
