package com.pywl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 控制层
 * @Author DongPo
 * @Date 2020-12 16:37
 */
@RestController
public class HelloController {

	/**
	 * hello 接口
	 *
	 * @return
	 */
	@RequestMapping(path = "/hello")
	public String hello() {
		return "HelloWorld！";
	}
}
