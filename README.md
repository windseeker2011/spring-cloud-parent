# 项目介绍
## 本项目介绍spring-cloud微服务架构，采用Zuul+Feign/Rubbon+Hystrix+Eureka等技术实现。 ##
### 测试地址 ###
`服务注册中心：http://localhost:1111/`<br/>
`服务实际提供方：http://localhost:2223/add?a=1&b=2`<br/>
`负载均衡+熔断机制：http://localhost:3333/add?a=1&b=2`<br/>
`应用网关：http://localhost:5555/api/add?a=1&b=2`<br/>
# 服务发现（Eureka）
`子项目eureka-server为服务发现服务端、子项目eureka-client*为服务发现客户端`
# 客户端负载均衡（Ribbon）
`子项目ribbon-server为前置服务器。`
# 客户端负载均衡（Feign）
`子项目feign-server为前置服务器。`
# 断路器（Hystrix）
`子项目ribbon-server、feign-server都支持Hystrix断路器。Feign天然支持Hystrix。`
# 智能路由（Zuul）
