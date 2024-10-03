package com.example.crud;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    private List<Student> students = new ArrayList<>();

    // Home page
    @GetMapping("/")
    public String home() {
        return "index";
    }

    // Display all students
    @GetMapping("/students")
    public String displayStudents(Model model) {
        model.addAttribute("students", students);
        return "display";
    }

    // Registration page
    @GetMapping("/register")
    public String registerStudent(Model model) {
        model.addAttribute("student", new Student());
        return "register";
    }

    // Save student
    @GetMapping("/saveStudent")
    public String saveStudent(String name, int age, String mobile, Model model) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        student.setMobile(mobile);
        students.add(student);
        model.addAttribute("students", students); // Display updated list after saving
        return "display"; // Show the updated student list
    }

    // Delete student page
    @GetMapping("/deletePage")
    public String deletePage(Model model) {
        model.addAttribute("students", students);
        return "delete"; // Display delete page
    }

    // Method to delete a student by index
    @GetMapping("/deleteStudent")
    public String deleteStudent(@RequestParam int index, Model model) {
        if (index >= 0 && index < students.size()) {
            students.remove(index); // Remove the student at the specified index
        }
        model.addAttribute("students", students); // Display updated list after deletion
        return "display"; // Show the updated student list
    }
}
