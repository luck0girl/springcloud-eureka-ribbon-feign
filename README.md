# springcloud-eureka-ribbon-feign
1、这是一个springcloud示例，其中有eureka注册中心，ribbon负载均衡，feign的简单调用案例。

2、microservice-eureka-server是一个简单的eureka注册中心，@EnableEurekaServer表示启用eureka注册中心，
    要先启动好这个注册中心，然后再启动别的项目。


3、microservice-eureka-client是一个eureka服务端，@EnableEurekaClient表示启用eureka客户端，
    是一个简单的服务提供端，该服务端会将自己注册到注册中心。


4、microservice-consumer-ribbon是一个简单的客户端，集成了ribbon，ribbon有负载均衡功能，
    用注解@LoadBalance启用ribbon并开启负载均衡，restTemplate进行远程访问http服务。


5、microservice-feign是集成了feign的一个简单客户端，feign本身整合了ribbon和hystrix，
    支持ribbon的负载均衡，支持hystrix和他的fallback。feign是一种声明式服务调用，
    在启动类上加上@EnableFeignClients注解表示启用feign。
    feign接口上加上注解@FeignClient(name = "eureka-client", fallback = FeignFallBack.class)。
feign的服务降级：
    5.1、首先我们要新建一个FeignFallBack类来实现feign接口。
    5.2、在feign接口的注解中加上一个fallback参数，并指向我们刚刚创建的FeignFallBack类。
    5.3、这样就可以使用feign的降级服务，一旦我们要调用的服务有异常，会自动返回FeignFallBack类中所定义的内容，而不是直接抛出异常。
