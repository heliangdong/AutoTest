package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/7/22.
 */
public class DateProviderTest {
    @Test(dataProvider = "date")
    public void ParamterTest1(String name,int age){
        System.out.println("name是"+name+"名字是"+age);
    }
@DataProvider(name="date")
    public  Object[][] ParamterTest1(){
        Object[][] o=new  Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}

        };
        return  o;
    }

@Test(dataProvider = "methodDate")
    public void test1(String name,int age){
        System.out.println("name是"+name+"名字是"+age);
    }
    @Test(dataProvider = "methodDate")
    public void test2(String name,int age){
        System.out.println("name是"+name+"名字是"+age);
    }

    @DataProvider(name="methodDate")
    public  Object[][] ParamterTest2(Method method){
        Object[] [] result=null;
         if(method.getName().equals("test1")){
             result=new Object[][]{
                 {"zhangsan",20},
                 {"lisi",25}
             };
         }else if(method.getName().equals("test2")){

    result=new Object[][]{
            {"wangwu",50},
            {"zhaoliu",60},
    };
             }
         return result;
    }

    }


