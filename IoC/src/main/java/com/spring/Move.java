package com.spring;

import com.spring.MessagePrinter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Move {
    public static void main(String[] args) {
        @SuppressWarnings("resources")
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        /*Meeting meeting =context.getBean(Meeting.class);*/
        Meeting meeting=context.getBean(Meeting.class);
        System.out.println(meeting+"/n");
    }
}