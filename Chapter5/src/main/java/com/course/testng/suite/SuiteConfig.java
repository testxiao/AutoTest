package com.course.testng.suite;

import org.testng.annotations.*;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("before suite运行啦");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("aftersuite 运行啦");
    }

    @BeforeTest
    public void beforeClass(){
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterClass(){
        System.out.println("afterTest");
    }
}
