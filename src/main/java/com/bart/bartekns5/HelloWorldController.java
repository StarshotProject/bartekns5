package com.bart.bartekns5;

import com.bart.bartekns5.model.Message;
import com.bart.bartekns5.model.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private MessageRepository messageRepository;

    @GetMapping("/hello")
    String hello(String token) {
        System.out.println("Hello World");

        Message msg = new Message(token);

        messageRepository.save(msg);
        return "Hello World 2";
    }

    @PostMapping("/hello-message")
    Message helloMessage(String token) {
        System.out.println(token);

        Message msg = new Message(token);

        return messageRepository.save(msg);
    }
}
