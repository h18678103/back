package com.sky.back.web.controller;

import com.sky.back.util.base.ServiceRet;
import com.sky.back.web.controller.base.BaseController;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huqinsong
 * @date 2018/11/12
 */
@RestController
@RequestMapping(value = "login")
public class LoginController extends BaseController {


    @RequestMapping(value = "login.do")
    public Map<String, Object> login() {
        System.out.println("login.do");
        return new ServiceRet().toMap();
    }
}
