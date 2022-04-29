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

```java
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		Alien obj = context.getBean(Alien.class);
		obj.code();
	}

}
```

- Run code and notice error `Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.LearnCsWithSatish.first.Alien' available
`
- Spring is responsible to create an object of `Alien` class. 
- Add @Component annotation as below so that Spring will know that it is responsible to create object of `Alien` and not programmer (you)

```java
import org.springframework.stereotype.Component;

@Component
public class Alien {
	public void code() {
		System.out.println("I am coding..");
	}
}
```

- Now code will run

END LEC 8
-------

9. Lecture 9

- Alien need Laptop to code


