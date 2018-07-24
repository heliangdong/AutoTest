package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/7/22.
 */
public class ParamterTest {

    @Test
    @Parameters({"name","age"})
    public void ParamterTest1(String name,int age){
        System.out.println("name是"+name+"名字是"+age);

    }
}
