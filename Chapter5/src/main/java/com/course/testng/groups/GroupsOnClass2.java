package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {

    public void stu1(){
        System.out.println("GroupsOnclass2中的stu111111111运行");
    }

    public void stu2(){
        System.out.println("GroupsOnclass2中的stu22222222运行");
    }
}
