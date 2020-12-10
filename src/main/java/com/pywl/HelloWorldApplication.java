package com.pywl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用,该类成为启动类。
 * @Author DongPo
 * @Date 2020-12 16:24
 */
@SpringBootApplication
public class HelloWorldApplication {
	/**
	 * main方法是程序的入口
	 *
	 * @param args main方法默认参数
	 */
	public static void main(String[] args) {
		// 此处放置的 class对象就是启动类的class对象
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	/*  SpringBootApplication主要包含以下三个注解：
			1. @SpringBootConfiguration ：标注在某个类上，表示这是一个Spring Boot的配置类。
				1.1 @Configuration : 类上标注该注解，表示这是 Spring 的配置类，对应 xml中的一个配置文件。
					1.1.1 @Component ：类上标注该注解，表示这是 Spring 的一个组件Bean。所以配置类其实也是一个组件Bean。
			2. @EnableAutoConfiguration : 告诉SpringBoot开启自动配置功能。
					根据引入的依赖自动配置已经定义好的开发时约定俗成的一些配置。
			3. @ComponentScan ： 会扫描自动配置及自定义配置的组件的注解，将组件放入Spring容器中
					默认情况下从标注了该注解的类（这里就是启动类）所在的包开始扫描，扫描所在的包及其所有子包。
	 */
}
