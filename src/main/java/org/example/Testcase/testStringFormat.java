package org.example.Testcase;

import org.testng.annotations.*;

public class testStringFormat {

    @BeforeClass
    public void TC_beforeclass(){
        System.out.println("before class");
    }

    @AfterClass
    public void TC_AfterClass(){
        System.out.println("after class");
    }

    @Test
    public void TC_01(){
        System.out.println("1");
    }

    @Test
    public void TC_02(){
        System.out.println("2");
    }

    @Test
    public void TC_03(){
        System.out.println("3");
    }

    @BeforeMethod
    public void testMethodBefore(){
        System.out.println("method before");
    }

    @AfterMethod
    public void testAfterMethod(){
        System.out.println("method after");
    }

    @BeforeTest
    public void testBefore(){
        System.out.println("test before");
    }

    @AfterTest
    public void testAfter(){
        System.out.println("test after");
    }

}
