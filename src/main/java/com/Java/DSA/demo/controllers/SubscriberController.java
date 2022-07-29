package com.Java.DSA.demo.controllers;

import com.Java.DSA.demo.models.Subscriber;
import com.Java.DSA.demo.services.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/subscribe")
public class SubscriberController {


    private SubscriberService subService;

    @Autowired
    public SubscriberController(SubscriberService subService){
        this.subService = subService;
    }


    @PostMapping
    public String postSubscriber(Subscriber sub){
        this.subService.saveSubscriber(sub);

        return "redirect:/home";
    }


}
