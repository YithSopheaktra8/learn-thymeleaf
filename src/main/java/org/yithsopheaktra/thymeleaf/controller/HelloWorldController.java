package org.yithsopheaktra.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    /**
     * handler method
     * message(attributeName) is variable you need to called in html on templates folder, and it will access the hello world!!
     * to show in html here is the 5 syntax in thymeleaf
     * ${...} variable expression
     * *{...} selection expression
     * #{...} message expression
     * @{...} link expression
     * ~{...} fragment expression
     * noted with the return the string return must be the same name as html filename in template folder
     * **/
    @GetMapping("/hello-world")
    public String helloWorld(Model model){
         model.addAttribute("message","Hello World!!");
         return "hello-world";
    }
}
