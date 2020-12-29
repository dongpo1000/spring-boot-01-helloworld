# spring-boot-01-helloworld
springboot之HelloWorld 参考sgg

# 1.HelloWorld项目搭建
- 新建 maven项目，导入pom依赖；
- 建包，建文件夹。编写启动类和测试类；
- 编写controller层代码；
- 访问测试。

# 2.打印请求信息
- 定义拦截器RequestLogInterceptor,加入spring容器中;
    - 用到了fastjson
- 添加自定义SpringMVC配置类，添加上面定义的拦截器。
- 请求测试。

