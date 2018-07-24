package com.course.testng.suite;

import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/7/22.
 */
public class DependTest {

    @Test
public void test(){
        System.out.println("test1 run");
    }
@Test(dependsOnMethods = {"test"})
    public void test2(){
        System.out.println("test2 run");
    }



}
