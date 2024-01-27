package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.*;
import com.example.demo.Dao.userDao;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class userController {
    
    @GetMapping("/get-page")
    public String getMethodName1() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        return "views/page.jsp";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        System.out.println("method run");
        return "views/dashboard.jsp";
    }

    @GetMapping("/dashboard2")
    public String dashboard2() {
        return "views/dashboard2.jsp";
    }
    
    



   
    

    @PostMapping("/login")
    public String postMethodName(@ModelAttribute userDao ud) 
    {
        String username = "Rajashri@123";
      String password = "pass@612";
String username2 = "Akansha@123";
String password2 = "pas@123";

        HashMap h = new HashMap();
        h.put(username, password);
        h.put(username2, password2);

    System.out.println("val : "+h.containsValue(ud.getPassword()));
     if(h.containsKey(ud.getUsername()) && h.containsValue(ud.getPassword()))
     {
        return "redirect:dashboard";
     } else{
        return "redirect:dashboard2";        
     }

        
        
    }
}
