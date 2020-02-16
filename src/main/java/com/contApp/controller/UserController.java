package com.contApp.controller;

import com.contApp.model.User;
import com.contApp.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController  {

        private UserRepository userRepository;

    public UserController(UserRepository userRepository){ //it will be autowired
       this.userRepository=userRepository;
    }

    @GetMapping("/*")
    public String getUserForm(Model model) {  //return a string of the viewname called "index"
        model.addAttribute("user", new User());
            return "index";
        }

     @GetMapping("/login")
     public String userLogin(Model model){
          model.addAttribute("userList", userRepository.findAll());
         return "index";
     }


        @PostMapping("/*")
        public String userSubmit (@ModelAttribute User user, Model model){
        model.addAttribute("user", user);
            return "welcome";
        }
    }