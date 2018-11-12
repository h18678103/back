package com.sky.back.util.base;

/**
 * @author huqinsong
 * @date 2018/11/12
 */
public enum RetInfoEnum implements RetInfo {

    SUCCESS                 ("00",  "成功"),
    FAIL                    ("01",  "失败"),
    INVALID_PARA            ("02",  "参数错误"),
    DB_FAIL                 ("03",  "数据更新失败"),
    PROCESSING              ("05",  "处理中"),
    SYS_BUSY                ("99",  "系统繁忙，请稍后再试");


    /** 返回码 */
    private String retCode;

    /** 返回描述 */
    private String retMsg;

    RetInfoEnum(String retCode, String retMsg) {
        this.retCode = retCode;
        this.retMsg = retMsg;
    }

    @Override
    public String getRetCode() {
        return retCode;
    }

    @Override
    public String getRetMsg() {
        return retMsg;
    }

}
