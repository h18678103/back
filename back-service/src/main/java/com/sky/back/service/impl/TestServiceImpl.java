package com.sky.back.service.impl;

import com.sky.back.dao.api.TestDao;
import com.sky.back.dao.entity.Test;
import com.sky.back.service.api.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author huqinsong
 * @date 2018/11/5
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public Test getTest(int id) {
        return testDao.getTest(id);
    }
}
