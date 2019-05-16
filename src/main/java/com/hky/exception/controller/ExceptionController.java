package com.hky.exception.controller;

import com.hky.exception.entity.ResponseData;
import com.hky.exception.service.ExceptionServiice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 异常测试接口
 */
@RestController
public class ExceptionController {

    @Autowired
    private ExceptionServiice exceptionServiice;

    /**
     * 全局异常接口测试
     * @param name
     * @return
     * @throws Exception
     */
    @RequestMapping("/test")
    public ResponseData test(String name) throws Exception{
        return exceptionServiice.findByName(name);
    }

}
