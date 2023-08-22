package com.springCore.Core.DependencyInjection;

import org.springframework.context.annotation.Bean;

public class ServiceB implements MessageService {
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Sending message from ServiceB: " + message + " to: " + receiver);
    }

    @Override
    public void sendEmail(String message, String receiver) {
        System.out.println("Sending email from ServiceB: " + message + " to: " + receiver);
    }

    @Override
    public void sendSms(String message, String receiver) {
        System.out.println("Sending sms from ServiceB: " + message + " to: " + receiver);
    }
}

