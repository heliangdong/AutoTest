package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/7/21.
 */

public class groupsmethod {

    @Test (groups = "server")
    public void test1(){
        System.out.println("服务端测试1");
    }

    @Test (groups = "server")
    public void test2(){
        System.out.println("服务端测试2");
    }

    @Test (groups = "client")
    public void test3(){
        System.out.println("客户端测试1");
    }

    @Test (groups = "client")
    public void test4(){
        System.out.println("客户端测试1");
    }
@BeforeGroups(groups = "client")
    public void test5(){
        System.out.println("BeforeGroups");
    }

    @AfterGroups(groups = "server")
    public void test6(){
        System.out.println("AfterGroups");
    }


}
