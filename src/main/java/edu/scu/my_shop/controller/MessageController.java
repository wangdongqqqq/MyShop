package edu.scu.my_shop.controller;

import edu.scu.my_shop.entity.Message;
import edu.scu.my_shop.service.MessageService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;
import java.util.List;
import java.util.Random;

/**
 * Created by Vicent_Chen on 2018/3/20.
 */
@Controller
public class MessageController {
    @Autowired
    MessageService messageService;

    @RequestMapping("/message")
    public String message() {
        return "message";
    }

    @RequestMapping("/send")
    public String send() {
        return "sendMessage";
    }

    @RequestMapping(value = "/serverMessage")
    public SseEmitter pushMessage() {
        Random random = new Random();
        SseEmitter emitter = new SseEmitter();
        List<Message> messageList = messageService.getUnreadMessage("for-message-test-recver");
        try {
            emitter.send(messageList);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            emitter.complete();
        }
        return emitter;
    }

    @RequestMapping("/sendMessage")
    public String sendMessage(@Param("message")Message message) {
        messageService.insertMessage(message);
        return "sendMessage";
    }
}
