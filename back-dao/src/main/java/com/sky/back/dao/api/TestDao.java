package com.sky.back.dao.api;

import com.sky.back.dao.entity.Test;
import org.mybatis.spring.annotation.MapperScan;

/**
 * @author huqinsong
 * @date 2018/2/26
 */
@MapperScan
public interface TestDao {

    Test getTest(int id);

}
