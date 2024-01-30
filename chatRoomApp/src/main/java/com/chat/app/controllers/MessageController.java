package com.chat.app.controllers;

import com.chat.app.models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    //any user who wants to send msg will send through this url.
    @MessageMapping("/message")
    //whosoever has subscribed to this url will receive the msg.
    @SendTo("/topic/return-to")
    public Message getContent(@RequestBody Message message){
        //message sent is delayed for some time.
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return message;
    }
}
