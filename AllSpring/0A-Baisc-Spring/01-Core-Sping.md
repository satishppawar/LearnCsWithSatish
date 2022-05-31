# Core Spring

- Create Maven Project
- Run following code & observe error `Caused by: java.io.FileNotFoundException: spring.xml`

```java
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
        Alien obj=(Alien) beanFactory.getBean("alien");
    }
}

```