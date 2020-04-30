package com.xll;

import com.xll.controller.UserController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-application.xml");
        UserController userController = (UserController)context.getBean("userController");

        System.out.println(userController);
    }
}
