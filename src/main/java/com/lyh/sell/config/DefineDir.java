package com.lyh.sell.config;

import ch.qos.logback.core.PropertyDefinerBase;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 刘元辉
 * @date 2020/2/21 12:39
 */
public class DefineDir extends PropertyDefinerBase {
    @Override
    public String getPropertyValue() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String defineDir = "log//" + format.format(date);
        return defineDir;
    }
}
