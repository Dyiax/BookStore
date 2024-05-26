package com.yj.utils;

import org.apache.commons.beanutils.BeanUtils;

import java.util.Map;

//copyParamToBean 方法：
//
//        该方法用于将请求参数映射到 JavaBean 中。
//        接受一个 Map 对象（通常是请求参数的键值对）和一个目标 JavaBean 对象。
//        使用 Apache Commons BeanUtils 库的 populate 方法将参数值注入到 JavaBean 中。
//parseInt 方法：
//
//        该方法用于将字符串转换为整数。
//        接受一个字符串和一个默认值作为参数。
//        尝试将字符串解析为整数，如果解析失败，则返回指定的默认值
public class WebUtils {
    /**
     * 快速注入
     * @param value
     * @param bean
     * @return
     */
    public static Object copyParamToBean(Map value, Object bean) {
        try {
            BeanUtils.populate(bean,value);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }

    public static int parseInt(String strInt,int defaultValue) {
        int n = 0;
        try {
            n = Integer.parseInt(strInt);
        } catch (Exception e) {
            return defaultValue;
        }
        return n;
    }

}
