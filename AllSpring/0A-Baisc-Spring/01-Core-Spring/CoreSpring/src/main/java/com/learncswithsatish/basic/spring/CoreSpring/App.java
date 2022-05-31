package com.learncswithsatish.basic.spring.CoreSpring;

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
