package com.stewart.cloud.common.utils;

import java.util.Random;

/**
 * @author Stewart
 * @create 2021/10/2
 */
public class CommonUtils {
    public static String generateCode(){
        Random random = new Random();
        String code="";
        for (int i=0;i<6;i++)
        {
            code+=random.nextInt(10);
        }
        return code;
    }
}
