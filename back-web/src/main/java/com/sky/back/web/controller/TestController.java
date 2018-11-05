package com.sky.back.web.controller;

import com.sky.back.web.controller.base.DataExceptionSolver;
import com.sky.back.web.controller.base.SystemException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author huqinsong
 * @date 2018/11/5
 */
@Controller
@RequestMapping(value = "test")
public class TestController implements DataExceptionSolver {

    @ResponseBody
    @RequestMapping(value = "t1.do")
    public String t1(int id){
        System.out.println("t1.do");
        int i = 1/0;
        return "abc";
    }

    @ResponseBody
    @RequestMapping(value = "t2.do")
    public String t2(int id){
        System.out.println("t2.do");
        throw new SystemException();
    }


    @ResponseBody
    @RequestMapping(value = "t3.do")
    public String t3(int id){
        System.out.println("t3.do");
        return "abc_good";
    }

    @ResponseBody
    @RequestMapping(value = "t4.do")
    public String t4(int id){
        System.out.println("t3.do");
        return "abc_good";
    }

}
