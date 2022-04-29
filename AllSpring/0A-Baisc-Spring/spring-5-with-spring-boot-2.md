# Day 1 Introduction
-----

1. [Spring Official Website](https://spring.io/)
2. [Spring Documentation](https://docs.spring.io/spring-framework/docs/5.0.0.M1/spring-framework-reference/epub/)

---

## inversion of Control (IOC) OR DI

- programmer do not need to create the objects, instead just describe how it should be created. 
- No need to directly connect your components and services together in program, instead just describe which services are needed by which components in a configuration file/xml file. The Spring IOC container is then responsible for binding it all up.

----

8. Dependency Injection in Spring

```java

	Alien obj=getBean(Alien.class); //can not be directly avaialble
	obj.code();
```

- ApplicationContext
- getBean()


