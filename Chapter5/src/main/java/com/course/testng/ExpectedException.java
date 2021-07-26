package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {

    /**
     *什么时候会用到异常测试？
     * 在我们期望结果为某一个异常的时候
     * 比如：我们传入了某些不合法的参数程序抛出了异常
     * 也就是说我的预期结果就是这个异常
     */
    //这是一个测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExpetionFailed(){
        System.out.println("这是一个失败的异常测试");
    }
    //这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeException(){
//        throw new RuntimeException();这个必须写在方法的下面，有一个执行顺序问题，先执行异常后下面就不会执行了
        System.out.println("这是我的异常测试");
        throw new RuntimeException();
    }
}
