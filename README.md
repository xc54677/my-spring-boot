SpringBoot2.X整合JPA/Hibernate过程中出现的问题:
1.
com.fasterxml.jackson.databind.exc.InvalidDefinitionException: No serializer found for class org.hibernate.proxy.pojo.javassist.JavassistLazyInitializer and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS) (through reference chain: com.example.demo.model.User_$$_jvstcc3_0["handler"])
问题背景为使用jackjson将对象json化的时候出现的错误.

解决办法一

在实体类上面加上注解:
@JsonIgnoreProperties(value = {"handler","hibernateLazyInitializer","fieldHandler"})

解决办法二

注册一个objectMapper覆盖掉默认的，这样就不用在每个类上面使用@JsonIgnoreProperties:

在userController类里加以下代码:

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper().disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
    }
    
2.
使用 JPA 出现的异常 ：

org.hibernate.LazyInitializationException: could not initialize proxy [com.example.demo.model.User#1] - no Session

问题是 jpa或hibernate的延迟加载的问题

可在 配置文件中加上以下配置 ：

spring.jpa.properties.hibernate.enable_lazy_load_no_trans=true