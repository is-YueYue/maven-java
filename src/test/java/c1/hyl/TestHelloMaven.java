package c1.hyl;

import org.junit.Assert;
import org.junit.Test;

/**
 * 作者: Huang
 * 时间: 2022-10-19
 * 测试程序：用于测试主程序中的类
 *   测试类名称：Test+主程序中的类的类名
 *
 *  maven批量测试类及类中的方法：
 *      配合【junit单元测试类】来使用  【 @Test  】
 *      单元测试类中的方法，使用@Test注解的方法要求：
 *          1、公共的 public
 *          2、无返回值 void
 *          3、无参
 *
 */
public class TestHelloMaven {//测试程序 类

    //测试HelloMaven类中的add方法
    @Test
    public void testAdd(){
        HelloMaven hm=new HelloMaven();
        int res=hm.add(10, 20);
        //验证被测试的方法结果是否符合预期值
        Assert.assertEquals(40, res);
    }

    @Test
    public void testJian(){
        HelloMaven hm=new HelloMaven();
        int res=hm.jian(10, 20);
        Assert.assertEquals(10, res);
    }

}
