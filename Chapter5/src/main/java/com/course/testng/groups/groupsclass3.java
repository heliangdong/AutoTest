package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/7/22.
 */
@Test(groups = "teacher")
public class groupsclass3 {
    public void teacher1(){
        System.out.println("groupclass1中的teacher1运行");
    }

    public void teacher2(){
        System.out.println("groupclass1中的teacher2运行");
    }

}
