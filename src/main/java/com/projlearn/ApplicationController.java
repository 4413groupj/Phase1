package com.projlearn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;

import com.projlearn.model.User;


//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpSession;

//import jakarta.servlet.http.HttpSession;

@Controller
public class ApplicationController {
	
	@Autowired
	UserRepo repo;
	
	
	@ModelAttribute
	public void modelData(Model m) {
		
		m.addAttribute("message", "EECSproject4413");// Just incase we need to pass some value to JSP via Model
	}

	
	@RequestMapping("/")
	public String home() {
		
		System.out.println("Home Page is requested "); 
		return "index";
	}
	
	@GetMapping("getUsers")
		
	public String getUsers(Model m) {
		
	m.addAttribute("userResult", repo.findAll());
	System.out.println("Fetched Users from Database");
		
		return "showusers";
	}	
	
	
	@PostMapping("addUser")
	
	
	public String addUser(@ModelAttribute ("userDetail")User user) {
		repo.save(user);
		System.out.println("User Added:"+user);
		//Yet another method
		
		return "user";
	}	
	
	
	@SuppressWarnings("deprecation")
	@GetMapping("getUser")
	
	
	public String getUser(@RequestParam int userID, Model m) {
		m.addAttribute("singleUserDetail", repo.getOne(userID));
		System.out.println("User Added:"+userID);
		//Yet another method
		
		return "showUser";
	}	
	
	
	

	@GetMapping("getUserByUserFirstName")
	
	
	public String getUserByUserFirstName(@RequestParam String userFirstName, Model m) {
		m.addAttribute("getUserByUserFirstName", repo.findByuserFirstName(userFirstName));
		//System.out.println("User Added:"+);
		//Yet another method
		
		return "showUserByName";
	}	
	
	
@GetMapping("getUserByUserSecondName")
	
	
	public String getUserByUserSecondName(@RequestParam String userSecondName, Model m) {
		m.addAttribute("getUserByUserSecondName", repo.findByuserSecondName(userSecondName));
		//System.out.println("User Added:"+);
		//Yet another method
		
		return "showUserBySecondName";
	}	
	
	
	
	
//	public String addUser(@ModelAttribute User userDetail, ModelMap m) {
//		
//		System.out.println(userDetail);
//		m.addAttribute("userDetail", userDetail);
//		
//		return "user";
//	}		
	
	
//	public String addUser(@RequestParam("userFirstName") String userFirstName, @RequestParam("userSecondName") String userSecondName, 
//			@RequestParam("userID") int userID, @RequestParam("emailAddress") String emailAddress, ModelMap m) {
//		
		
		
//		String userDetail = "User Details are :\n"+ userFirstName+"\n"+userSecondName+"\n"+userID+"\n"+emailAddress+"\n";
//		m.addAttribute("userdetail", userDetail);
		
		
		
//		User userDetail = new User();
//		userDetail.setUserFirstName(userFirstName);
//		userDetail.setUserSecondName(userSecondName);
//		userDetail.setUserID(userID);
//		userDetail.setEmailAddress(emailAddress);
//		m.addAttribute("userDetail", userDetail);
//		System.out.println(userDetail);
////		System.out.println("User Details are :\n"+ userFirstName+"\n"+userSecondName+"\n"+userID+"\n"+emailAddress+"\n");
////		
//		return "user";
//
//
//	}
	
	
	
	
//	public String add(@RequestParam("number1") int number1, @RequestParam("number2") int number2, ModelMap m) {
//		
//		
//	 	
//		int result = number1+number2;
//		System.out.println("Result:"+result);
//		m.addAttribute("result", result);
//		
//		return "add";
//
//
//	}
	
	
//	public String add(@RequestParam("number1") int number1, @RequestParam("number2") int number2, Model m) {
//		
//		
//		 	
//			int result = number1+number2;
//			System.out.println("Result:"+result);
//			m.addAttribute("result", result);
//			
//			return "add";
//	
//
//		}
	
	
//	public ModelAndView add(@RequestParam("number1") int number1, @RequestParam("number2") int number2) {
//		
//		
//		 ModelAndView mv = new ModelAndView("add"); //add view name here 
//		    //mv.setViewName("add");
//			int result = number1+number2;
//			System.out.println("Result:"+result);
//			mv.addObject("result", result);
//			
//			return mv;
//		
////		    ModelAndView mv = new ModelAndView();
////		    mv.setViewName("add");
////			int result = number1+number2;
////			System.out.println("Result:"+result);
////			mv.addObject("result", result);
////			
////			return mv;
//		}
	
	
//	public String add(@RequestParam("number1") int number1, @RequestParam("number2") int number2, HttpSession session) {
//	
//		int result = number1+number2;
//		System.out.println("Result:"+result);
//		session.setAttribute("result", result);
//		
//		return "add.jsp";
//	}
	
	
//	public String add(HttpServletRequest req) {
//		
//		int number1 = Integer.parseInt(req.getParameter("number1"));
//		int number2 = Integer.parseInt(req.getParameter("number2"));
//		int result = number1+number2;
//		System.out.println("Result:"+result);
//		HttpSession session = req.getSession();
//		session.setAttribute("result", result);
//		
//		return "add.jsp";
//	}
//	
//	
	
//	public ModelAndView add(@RequestParam("number1")int i, @RequestParam("number2")int j ) {
//		
//		System.out.println("Addition Page is requested ");
//		ModelAndView mv = new ModelAndView();
//		
//		int result = i+j;
//		
//		mv.addObject("result", result);
//		mv.setViewName("add.jsp");
//		return mv;
//	}
	
}
