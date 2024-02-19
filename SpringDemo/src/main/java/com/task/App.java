package com.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("empbean.xml");
        Employee emp = (Employee) context.getBean("empBean");
        System.out.println(emp);
        
    }
}
