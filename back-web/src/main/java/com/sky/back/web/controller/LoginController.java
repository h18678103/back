package com.sky.back.web.controller;

import com.sky.back.dao.entity.UserInfo;
import com.sky.back.util.base.RetInfoEnum;
import com.sky.back.util.base.ServiceRet;
import com.sky.back.web.controller.base.BaseController;
import java.util.Map;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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
    public Map<String, Object> login(@Validated UserInfo userInfo, BindingResult result) {
        if (result.hasErrors()) {
            Map<String, String> validErrors = getValidErrors(result.getAllErrors());
            return new ServiceRet<Map<String, String>>().fail(RetInfoEnum.INVALID_PARA, validErrors).toMap();
        }
        System.out.println("login.do");
        return new ServiceRet().toMap();
    }
}
