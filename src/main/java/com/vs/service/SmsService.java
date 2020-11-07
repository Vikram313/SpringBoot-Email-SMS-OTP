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
    public static final String ACCOUNT_SID = "XXXXXXXXXXXXXXXXXXXX";
    public static final String AUTH_TOKEN = "XXXXXXXXXXXXXXXXXXXX";

    public Message sendSMS() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+XXXXXXXXXXX"),//The phone number you are sending text to
                new com.twilio.type.PhoneNumber("+XXXXXXXXXXX"),//The Twilio phone number
                "Teaching is The new learning")
           .create();

        return message;
    }
}
