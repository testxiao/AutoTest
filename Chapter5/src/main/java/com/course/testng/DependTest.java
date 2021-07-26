package com.course.testng;

import org.testng.annotations.Test;

/**
 * 依赖测试
 */

public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 跑起来");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 跑起来");
    }
}
