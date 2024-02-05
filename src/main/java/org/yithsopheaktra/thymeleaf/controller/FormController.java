package org.yithsopheaktra.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.yithsopheaktra.thymeleaf.model.UserForm;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {
    // handle user register request
    @GetMapping("register")
    public String userRegistrationPage(Model model){
        // empty user form
        UserForm userForm = new UserForm();
        model.addAttribute("userForm",userForm);

        List<String> listProfession = Arrays.asList("Developer", "Tester", "Architect");
        model.addAttribute("listProfession", listProfession);
        return "register-form";
    }

    // handle user registration form submission request
    @PostMapping("register/save")
    public String submitForm(Model model, @ModelAttribute("userForm") UserForm userform){
        model.addAttribute("userForm", userform);
        return "register-sucess";
    }
}
