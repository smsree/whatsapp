package com.example.demo;
import com.twilio.Twilio;
import com.twilio.converter.Promoter;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.net.URI;
import java.math.BigDecimal;
public class Dummy3 {

        public static final String ACCOUNT_SID = "ACb08406730d377f89e393db03b3045ea7";
        public static final String AUTH_TOKEN = "5d5bb842aad11653009f26fa0f017eeb";

        public static void main(String[] args) {
            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
            Message message = Message.creator(
                            new com.twilio.type.PhoneNumber("whatsapp:+919486930699"),
                            new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                            "Your Yummy Cupcakes Company order of 1 dozen frosted cupcakes has shipped and should be delivered on July 10, 2019. Details: http://www.yummycupcakes.com/")
                    .create();

            System.out.println(message.getSid());

    }
}
