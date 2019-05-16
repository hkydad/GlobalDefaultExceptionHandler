package com.hky.exception.service;

import com.hky.exception.dao.IExceptionDao;
import com.hky.exception.entity.ExceptionTest;
import com.hky.exception.entity.ResponseData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 异常测试service
 * 2019-05-16 hky
 */
@Service
public class ExceptionServiice {


    @Resource
    private IExceptionDao exceptionDao;

    private Logger log = LoggerFactory.getLogger(getClass());


    public ResponseData findByName(String name) throws Exception {
        try {
            ExceptionTest e = exceptionDao.findByName(name);
            return new ResponseData(200,"success",e);
        }catch (Exception e){
            log.error(e.getMessage());
            throw new Exception(e.getMessage(),e);
        }

    }
}
