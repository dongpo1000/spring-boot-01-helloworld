package com.pywl.common.config;

import com.pywl.common.interceptor.RequestLogInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * Description: SpirngMVC 添加自定义配置
 *
 * @author DongPo
 * @date 2020-12 17:07
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	@Resource
	private RequestLogInterceptor requestLogInterceptor;


	/**
	 * 添加拦截器
	 *
	 * @param registry 注册器
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(requestLogInterceptor)
			.excludePathPatterns("/js/**", "/image/**", "/css/**");
	}
}
