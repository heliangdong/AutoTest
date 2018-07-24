package com.course.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/7/20.
 */
public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("这是测试用例");
    }


@BeforeMethod
    public void befireMethod(){
        System.out.println("测试方法之前运行");
    }

    @AfterClass
    public void AfterMethod(){
        System.out.println("测试方法之前运行");
    }

    @BeforeSuite
    public  void BeforeSuite(){
        System.out.println("BeforeSuite测试套件");

    }



}
