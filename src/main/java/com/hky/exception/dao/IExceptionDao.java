package com.hky.exception.dao;

import com.hky.exception.entity.ExceptionTest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * 异常测试接口类
 * 2019-05-16 hky
 */
@Repository
public interface IExceptionDao extends CrudRepository<ExceptionTest,Long> {

    ExceptionTest findByName(String name);
}
