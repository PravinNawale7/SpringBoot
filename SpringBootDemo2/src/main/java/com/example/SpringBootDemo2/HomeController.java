package com.example.SpringBootDemo2;

	import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;

	@Controller
	public class HomeController {
		
		@GetMapping("/")
		public String disp(Model model) {
			String msg = "Hii I am Student";
			model.addAttribute("msg1",msg);
			return "index";
		}
		
		@GetMapping("/list")
		public String show(Model model) {
			List<String>msg = new ArrayList<String>();
			msg.add("Pravin");
			msg.add("Shubham");
			msg.add("Yashodeep");
			msg.add("Nisarg");
			model.addAttribute("msg2",msg);
			return "list";
		}
		
		@GetMapping("/course")
		public String showCourse(Model model) {
			List<String>course = new ArrayList<String>();
			course.add("DSA");
			course.add("Java");
			course.add("HTML");
			model.addAttribute("msg3", course);
			return "course1";
			
		}

	}
