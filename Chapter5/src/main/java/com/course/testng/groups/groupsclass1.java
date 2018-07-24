package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/7/22.
 */
@Test(groups = "stu")
public class groupsclass1 {
    public void stu1(){
        System.out.println("groupclass1中的stu1运行");
    }

    public void stu2(){
        System.out.println("groupclass1中的stu2运行");
    }
}
