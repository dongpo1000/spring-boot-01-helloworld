package com.pywl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Description: 测试用。需引入测试启动器。
 * <br/>
 * 如果测试类和启动类不在用一个包路径下，第一个注解需写成这样：@SpringBootTest(classes = HelloWorldApplication.class)
 * 详情参考博客：https://blog.csdn.net/dongpo11/article/details/108910589
 * <br/>
 * 如果不需要注入容器中的Bean，@RunWith(SpringRunner.class)可以省略。
 *
 * @author DongPo
 * @date 2020-12 16:40
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestHelloWorldApplication {

	@Test
	public void test() {
		System.out.println("测试一下，你就知道。");
	}
}
