package com.Java.DSA.demo.controllers;

import com.Java.DSA.demo.models.Subscriber;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("subscriber", new Subscriber());
        return "home";
    }

    @GetMapping("/post/trees/1")
    public String treeOne(Model model){
        model.addAttribute("test","<h1>another one</h1>");
        return "blogPostOne";
    }

    @GetMapping("/admin/post/create")
    public String createPost(Model model){
        model.addAttribute("test","<h1 class=\"red\">testing</h1>");

        return "createPost";
    }
}
