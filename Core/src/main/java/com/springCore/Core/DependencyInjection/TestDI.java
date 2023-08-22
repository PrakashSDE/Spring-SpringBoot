package com.springCore.Core.DependencyInjection;

import com.springCore.Core.CoreApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

public class TestDI {
    public static void main(String[] args) {
        //     with dependency injection
        //     (constructor injection)
        App app = new App(new ServiceA());
        app.service.sendMessage("Hi", "Raj");
        app.service.sendEmail("Hi", "Raj");
        app.service.sendSms("Hi", "Raj");

        // (setter injection)
        App app1 = new App(new ServiceB());
        app1.setService(new ServiceB());
        app1.service.sendMessage("Hi", "Raj");
        app1.service.sendEmail("Hi", "Raj");
        app1.service.sendSms("Hi", "Raj");


        // without dependency injection
        MessageService  serviceB = new ServiceB();
        serviceB.sendEmail("Hi", "Raj");
        serviceB.sendSms("Hi", "Raj");
        serviceB.sendMessage("Hi", "Raj");


    }
}
