package com.springCore.Core.DependencyInjection;

public class ServiceA implements MessageService {
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Sending message: " + message + " to: " + receiver);
    }

    @Override
    public void sendEmail(String message, String receiver) {
        System.out.println("Sending email: " + message + " to: " + receiver);
    }

    @Override
    public void sendSms(String message, String receiver) {
        System.out.println("Sending sms: " + message + " to: " + receiver);
    }
}


