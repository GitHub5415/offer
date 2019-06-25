package com.foroffer;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * 用于测试房
     */
    @Before
    public void init(){
        System.out.println("测试方法初始化方法");
    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    /**
     * 测试方法
     */
    @Test
    public void testAdd(){
        App app=new App();
        int result=app.add(1,2);
        System.out.println(result);
    }

    @Test
    public void testDiv(){
       App app=new App();
       int tt=app.div(1,1);

        Assert.assertEquals(tt,2);
    }

    @After
    public void colse(){
        System.out.println("关闭测试,,,,");
    }


}
