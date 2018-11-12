package com.sky.back.web.controller;

import com.sky.back.dao.entity.Test;
import com.sky.back.service.api.TestService;
import com.sky.back.web.controller.base.BaseController;
import com.sky.back.web.controller.base.DataExceptionSolver;
import com.sky.back.web.controller.base.SystemException;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author huqinsong
 * @date 2018/11/5
 */
@Controller
@RequestMapping(value = "test")
public class TestController extends BaseController {

    @Resource
    private TestService testService;

    @ResponseBody
    @RequestMapping(value = "t1.do")
    public String t1(int id) {
        System.out.println("t1.do");
        Test test = testService.getTest(id);
        return test == null ? "test is null!" : test.toString();
    }

    @ResponseBody
    @RequestMapping(value = "t2.do")
    public String t2(int id) {
        System.out.println("t2.do");
        throw new SystemException();
    }


    @ResponseBody
    @RequestMapping(value = "t3.do")
    public String t3(int id) {
        System.out.println("t3.do");
        return "abc_good";
    }

    @ResponseBody
    @RequestMapping(value = "t4.do")
    public String t4(int id) {
        System.out.println("t3.do");
        return "abc_good";
    }

}
