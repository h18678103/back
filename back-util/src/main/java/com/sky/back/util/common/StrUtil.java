package com.sky.back.util.common;

import org.apache.commons.lang3.StringUtils;

/**
 * @author huqinsong
 * @date 2018/11/12
 */
public class StrUtil {

    /**
     * 检查字符串是否为空
     * @param s 字符串
     * @return yes|no
     */
    public static boolean isBlank(String s) {
        return StringUtils.isBlank(s);
    }

}
