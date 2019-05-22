package com.kgate.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kgate.test.entity.Student;

@Controller
public class StudentController {

	@RequestMapping("/Welcome")
	public String index() {
		return "StudentHome";
	}

	@RequestMapping(value = "/submitstudent", method = RequestMethod.POST)

	public String Submit(@ModelAttribute("student") Student student, Model model) {
		String fname = student.getFirstName();
		String lname = student.getLastName();
		System.out.println("names : " + fname + " " + lname);
		model.addAttribute("fname", fname);
		model.addAttribute("lname", lname);
		return "submit";
	}
}
