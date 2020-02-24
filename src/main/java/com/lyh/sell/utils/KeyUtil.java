package com.lyh.sell.utils;

import java.text.SimpleDateFormat;
import java.util.Random;

/**
 * @author 刘元辉
 * @date 2020/2/24 18:54
 */
public class KeyUtil {

    public static synchronized String genUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMddHHmmss");

        return dateformat.format(System.currentTimeMillis()) + String.valueOf(number);
    }

}
