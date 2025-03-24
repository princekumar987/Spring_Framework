package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dto.EmployeeDTO;

@Controller
public class MyController {
	
	@GetMapping(path={"insert"})
	public String  insertView() {
		
		return "insert";
	}
	
//	@PostMapping(path={"insert"})
//	public String insertData(HttpServletRequest request) {
//		
//		String id=request.getParameter("id");
//		String name=request.getParameter("name");
//		
//		System.out.println(id+" "+name);
//		
//		return "insert";
//	}
	
	
	@PostMapping(path={"insert"})
	public String insertData(@ModelAttribute  EmployeeDTO employeedTO,Model model,RedirectAttributes redirectAttributes) {
		System.out.println("**********");
		System.out.println(employeedTO.getId()+" "+employeedTO.getName());
		
//		model.addAttribute("key","success");
		 redirectAttributes.addFlashAttribute("key", "success");
         
		return "redirect:insert";
		
		
	}
	
	
//	
//	@PostMapping(path={"insert"})
//	public String insertData(@RequestParam("id") int id) {
//		
//		System.out.println(id);
//		
//		return "insert";
//		
//		
//	}

}
