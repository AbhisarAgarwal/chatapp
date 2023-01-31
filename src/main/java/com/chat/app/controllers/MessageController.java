package com.chat.app.controllers;

import com.chat.app.models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @MessageMapping("/message") //client will send msg
    @SendTo("/topic/return-to") // to subscribe to receive messages
    public Message getContent(@RequestBody Message message){

//        try {
//            //processing
//             Thread.sleep(1000); //delay after sending msg
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
        return message;
    }
}
