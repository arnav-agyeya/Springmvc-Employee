package arn.first.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import arn.first.entity.AdminPojo;
import arn.first.service.AdminServiceIn;

@Controller
public class AdminController {
	
	@Autowired
	private AdminServiceIn as;
	
	@RequestMapping("/")
	public ModelAndView first(){
		ModelAndView mv=new ModelAndView();
		mv.addObject("command", new AdminPojo());
		mv.setViewName("login");
		return mv;
	}
	
	@RequestMapping("/con")
	public ModelAndView second(@ModelAttribute AdminPojo user) throws ClassNotFoundException, SQLException {
		ModelAndView mv=new ModelAndView();
		mv.addObject("username",user.getUserName() );
		if(as.searchAdmin(user.getUserName(), user.getPassWord()))
			mv.addObject("message", "Login Successful!");
		else
			mv.addObject("message", "Login Failed!!");
		mv.setViewName("result");
		
		return mv;
	}
	
}
