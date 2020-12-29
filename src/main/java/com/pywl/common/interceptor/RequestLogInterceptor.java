package com.pywl.common.interceptor;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Description: 请求信息记录拦截器
 *
 * @author DongPo
 * @date 2020-12 16:46
 */
@Component
public class RequestLogInterceptor implements HandlerInterceptor{

	/**
	 * 日志记录器
	 */
	private static final Logger log = LoggerFactory.getLogger(RequestLogInterceptor.class);

	/**
	 * 拦截请求
	 *
	 * @param request  请求
	 * @param response 响应
	 * @param handler  处理器
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		// 如果日志记录器日志级别是 debug，则打印记录。例：logging.level.com.pywl.common.interceptor=debug
		if (log.isDebugEnabled()) {
			log.info("请求 URI:" + request.getRequestURI());
			log.info("请求参数:" + JSON.toJSONString(request.getParameterMap()));
		}
		return true;
	}
}
