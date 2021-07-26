package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "test1")
    public void testDataProvider(String name,int age){
        System.out.println("name :"+name+"; age :"+age);
    }
    @DataProvider(name = "test1")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"lisi",11},
                {"wangwu",15}
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1方法 name="+name+";age="+age);

    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2方法 name="+name+";age="+age);

    }
    @DataProvider(name="methodData")
    public Object[][] methodData(Method method){
        Object[][] result=null;

        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"xiaobai",21},
                    {"小黑",22}
            };
        }else if (method.getName().equals("test2")){
            result = new Object[][]{
                    {"小红22",35},
                    {"小张22",24}
            };
        }
        return result;
    }

}
