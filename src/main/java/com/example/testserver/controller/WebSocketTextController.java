package com.example.testserver.controller;

import com.example.testserver.dto.TextMessageDTO;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller
public class WebSocketTextController {

    @MessageMapping("/message")
    @SendTo("/msg/input")
    private Map<Object, Object> receiveText(@Payload Map<Object, Object> textMessageDTO){
        return textMessageDTO;
    }
}
