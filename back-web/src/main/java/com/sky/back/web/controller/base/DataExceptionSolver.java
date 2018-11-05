package com.sky.back.web.controller.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 异常处理
 * @author huqinsong
 * @date 2018/8/23
 */
public interface DataExceptionSolver {

    Logger log = LoggerFactory.getLogger(DataExceptionSolver.class);

    /**
     * 异常处理
     * @param e
     * @return
     */
    @ExceptionHandler
    @ResponseBody
    default Object exceptionHandler(Exception e){
        try {
            throw e;
        } catch (SystemException systemException) {
            log.info("interface SystemException 你好！");
            systemException.printStackTrace();
            return "interface SystemException 你好！";
        } catch (Exception e1){
            log.info("interface 系统错误 你好！");
            e1.printStackTrace();
            return "interface 系统错误 你好！";
        }
    }
}
