
#### 1.模块介绍
- api模块下是公有类和工具方法，目前只有书的bean类
- consumer 是消费者模块，其中控制器的方法为了避免401权限错误在http请求头加入了用户名和密码
- provider 是生产者模块，安全功能由自定义security模块负责
- security 是基于springsecurity的自定义安全拦截器，只让有权限的人访问provider页面
- eureka/eureka2/eureka3 是伪集群，通过心跳检测来与provider保持联系，而eureka服务器的安全由spirngsecurity负责