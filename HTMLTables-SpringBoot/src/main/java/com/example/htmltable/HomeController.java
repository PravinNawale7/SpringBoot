package com.example.htmltable;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String show(Model model) {
        List<String> Stu = new ArrayList<>();
        Stu.add("Pravin");
        Stu.add("Shubham");
        Stu.add("Yashodeep");
        Stu.add("Prasad");
        model.addAttribute("Student", Stu);
        
        return "table";
    }
}
