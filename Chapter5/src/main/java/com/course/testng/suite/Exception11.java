package com.course.testng.suite;

import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/7/22.
 */
public class Exception {

    @Test(expectedExceptions = Exception.class)
    public void run1Exception1(){
        System.out.println("这是一个异常测试");
    }

    @Test(expectedExceptions = Exception.class)
    public void run1Exception2(){
        System.out.println("这是一个异常测试");
        throw new Exception();

    }




}
