package org.yithsopheaktra.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.yithsopheaktra.thymeleaf.model.User;

@Controller
public class UserController {
    /**
     * http://localhost:8080/variable-expression
     * **/
    @GetMapping("variable-expression")
    public String variableExpression(Model model){
        User user = new User("yith sopheaktra","pheaktra@gmail.com","admin","male");
        model.addAttribute("user",user);
        return "variable-expression";
    }

    /**
     * handle method to handle selection expression
     * http://localhost:8080/selection-expression
     * **/
    @GetMapping("selection-expression")
    public String selectionExpression(Model model){
        User user = new User("yith sopheaktra","pheaktra@gmail.com","admin","male");
        model.addAttribute("user",user);
        return "selection-expression";
    }
    /**
     * handle method to handle link expression
     * http://localhost:8080/link-expression
     * **/
    @GetMapping("/link-expression")
    public String linkExpression(Model model){
        model.addAttribute("id",1);
        return "link-expression";
    }


}
