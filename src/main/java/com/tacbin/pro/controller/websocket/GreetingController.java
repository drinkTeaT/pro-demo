package com.tacbin.pro.controller.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author EDZ
 * @description
 * @date 2020/7/30 10:04
 */
@Controller
public class GreetingController {
    @Resource
    private SimpMessagingTemplate simpMessagingTemplate;

    public GreetingController() {
    }

    @RequestMapping({"/helloSocket"})
    public String index() {
        return "/hello/index";
    }

    @MessageMapping({"/change-notice"})
    public void greeting(String value) {
        System.out.println("收到信息" + value);
        this.simpMessagingTemplate.convertAndSend("/topic/notice", value);
    }

    @MessageMapping({"/change-notice1"})
    @SendTo({"/topic/notice"})
    public String greeting1(String value) {
        return value;
    }
}
