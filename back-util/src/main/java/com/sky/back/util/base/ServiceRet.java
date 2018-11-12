package com.sky.back.util.base;

import com.sky.back.util.common.StrUtil;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huqinsong
 * @date 2018/11/12
 */
public class ServiceRet<T> implements RetInfo, Serializable {

    /** 返回码 */
    private String retCode;

    /** 返回描述 */
    private String retMsg;

    /** 返回内容 */
    private T content;

    public ServiceRet() {
        success();
    }

    public ServiceRet<T> success() {
        this.retCode = RetInfoEnum.SUCCESS.getRetCode();
        this.retMsg = RetInfoEnum.SUCCESS.getRetMsg();
        return this;
    }

    public ServiceRet<T> success(String retMsg) {
        this.retCode = RetInfoEnum.SUCCESS.getRetCode();
        this.retMsg = StrUtil.isBlank(retMsg) ? RetInfoEnum.SUCCESS.getRetMsg() : retMsg;
        return this;
    }

    public ServiceRet<T> fail(){
        this.retCode = RetInfoEnum.FAIL.getRetCode();
        this.retMsg = RetInfoEnum.FAIL.getRetMsg();
        return this;
    }

    public ServiceRet<T> fail(String retMsg){
        this.retCode = RetInfoEnum.FAIL.getRetCode();
        this.retMsg = StrUtil.isBlank(retMsg) ? RetInfoEnum.FAIL.getRetMsg() : retMsg;
        return this;
    }

    public ServiceRet<T> fail(RetInfoEnum retInfoEnum){
        this.retCode = retInfoEnum.getRetCode();
        this.retMsg = retInfoEnum.getRetMsg();
        return this;
    }

    public ServiceRet<T> fail(RetInfoEnum retInfoEnum, String retMsg){
        this.retCode = retInfoEnum.getRetCode();
        this.retMsg = StrUtil.isBlank(retMsg) ? retInfoEnum.getRetMsg() : retMsg;
        return this;
    }

    public ServiceRet<T> fail(RetInfoEnum retInfoEnum, T content){
        this.retCode = retInfoEnum.getRetCode();
        this.retMsg = retInfoEnum.getRetMsg();
        this.content = content;
        return this;
    }


    @Override
    public String getRetCode() {
        return retCode;
    }

    @Override
    public String getRetMsg() {
        return retMsg;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> retMap = new HashMap<>(3);
        retMap.put("retCode", retCode);
        retMap.put("retMsg", retMsg);
        if(null != content){
            retMap.put("content", content);
        }
        return retMap;
    }
}
