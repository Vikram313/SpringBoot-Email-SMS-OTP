/**
 * 
 */
package com.vs.service;

import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;


/**
 * @author OGS
 *
 */
@Service
public class SmsService {
    // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "AC2f6b38fcad89e9ab1916bee8d159bd99";
    public static final String AUTH_TOKEN = "4dd694ca06b559305b5423335e235d8f";

    public Message sendSMS() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+917696250550"),//The phone number you are sending text to
                new com.twilio.type.PhoneNumber("+12059227798"),//The Twilio phone number
                "Teaching is The new learning")
           .create();

        return message;
    }
}
