package com.springCore.Core.DependencyInjection;

public interface MessageService {
    void sendMessage(String message, String receiver);
    void sendEmail(String message, String receiver);
    void sendSms(String message, String receiver);

}
