package com.course.testng.multlThread;

import org.testng.annotations.Test;

/**
 * 多线程测试
 */

public class MultiThreadOnAnntion {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }

}
