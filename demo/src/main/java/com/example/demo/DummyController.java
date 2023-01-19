package com.example.demo;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
class DummyController{
    public static final String ACCOUNT_SID = "";
    public static final String AUTH_TOKEN = "";
    @PostMapping(value = "/web",consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE},
            produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public void message(Request request){
        System.out.println("message received");
        System.out.println( request.toString());
        if(request.getBody().toLowerCase().equals("hi")){
            String msg = "Hello "+ request.getProfileName() +" Welcome to Axis Bank we are providing personal loan with least document if you are interested please replay yes else say no";
            sendReplay(request.getFrom(),msg);
        } else if (request.getBody().toLowerCase().equals("yes")) {
            sendReplay(request.getFrom(),"Thank you  "+ request.getProfileName());
        } else if (request.getBody().toLowerCase().equals("no")) {
            sendReplay(request.getFrom(),"Thank you for your time if interested in future please come back");
        }
        else {
            sendReplay(request.getFrom(),"Please enter valid fields");
        }
    }
    private void sendReplay(String to,String msg){
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber(to),
                        new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                        msg)
                .create();

        System.out.println(message);
    }
}