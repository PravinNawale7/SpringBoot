package com.example.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;

@Controller  
public class RegistrationFormController {

    private List<Student> studentList = new ArrayList<>();

    @GetMapping("/register")
    public String register() {
        return "register";  
    }

    @GetMapping("/show")
    public String dataInsert(@RequestParam("name") String name,
                             @RequestParam("age") int age,
                             @RequestParam("rno") int rollno,Model model) {
        
        studentList.add(new Student(rollno, age, name));

        model.addAttribute("students", studentList);

        return "showData";  
    }
    
}
