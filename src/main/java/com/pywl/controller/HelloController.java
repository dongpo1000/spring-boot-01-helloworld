package com.pywl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: 控制层(本项目尽量不涉及)
 *
 * @author DongPo
 * @date 2020-12 16:37
 */
@RestController
@RequestMapping(path = "/api")
public class HelloController {

	/**
	 * hello 接口
	 *
	 * @return 字符串
	 */
	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "HelloWorld！";
	}
}
