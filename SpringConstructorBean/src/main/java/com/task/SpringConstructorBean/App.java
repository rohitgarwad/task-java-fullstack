package com.task.SpringConstructorBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("studentbean.xml");
        Student std = (Student) context.getBean("studentBean");
        Student std1 = (Student) context.getBean("studentSetter");
        System.out.println(std);
        System.out.println(std1);
        System.out.println(context.getBean("studentBean"));
    }
}
