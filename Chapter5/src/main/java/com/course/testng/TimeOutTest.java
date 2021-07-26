package com.course.testng;

import org.testng.annotations.Test;

public class TimeOutTest {

    @Test(timeOut = 3000)//单位为毫秒值
    public void testSuccess() throws InterruptedException{
        Thread.sleep(2000);
        System.out.println("没有超时");
    }
    @Test(timeOut = 3000)
    public void testFailed()  throws InterruptedException{
        Thread.sleep(5000);
    }
}
