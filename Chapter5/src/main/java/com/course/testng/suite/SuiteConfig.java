package com.course.testng.suite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by Administrator on 2018/7/20.
 */
public class SuiteConfig {
    @BeforeSuite
    public  void beforeSuite(){
        System.out.println("beforeSuite测试套件之前运行");
    }

    @AfterSuite
    public  void AfterSuite(){
        System.out.println("AfterSuite测试套件之后运行");
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
