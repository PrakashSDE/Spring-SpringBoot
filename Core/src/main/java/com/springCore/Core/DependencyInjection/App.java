package com.springCore.Core.DependencyInjection;

public class App {
    public static void main(String[] args) {
        /*ServiceA service = new ServiceA();
        ServiceB service2 = new ServiceB();
        service.sendMessage("Hi", "Raj");
        service.sendEmail("Hi", "Raj");
        service.sendSms("Hi", "Raj"); */
    }


    // Constructor Injection
    public MessageService service;
     public App(MessageService service){
      this.service = service;
   }

    // Setter Injection
    public void setService(MessageService service) {
        this.service = service;
    }


}
