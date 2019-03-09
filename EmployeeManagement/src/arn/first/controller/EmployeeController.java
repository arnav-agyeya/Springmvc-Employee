package arn.first.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.tomcat.util.log.UserDataHelper.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import arn.first.entity.AdminPojo;
import arn.first.entity.EmployeePojo;
import arn.first.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService es;
	
	@RequestMapping("/employees")
	public ModelAndView first() {
		ModelAndView mv=new ModelAndView();
		ArrayList<EmployeePojo> res=null;
		try {
			res=es.showAllEmployees();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mv.addObject("message","Dekho jara!!!");
		mv.addObject("EmployeeList", res);
		mv.setViewName("display");
		return mv;
	}
	
	@RequestMapping("/insert")
	public ModelAndView second() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("command", new EmployeePojo());
		mv.setViewName("insertrecord");
		return mv;
	}
	
	@RequestMapping("/afterinsert")
	public ModelAndView third(@ModelAttribute EmployeePojo ep) {
		ModelAndView mv = new ModelAndView();
		boolean fl = false;
		try {
			fl = es.insertEmployees(ep);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(fl) 
			mv.addObject("message", "Insert Successful!!");
		
		else
			mv.addObject("message", "Insertion failed!!");
		mv.setViewName("afterinsertmessage");
		return mv;
	}
}
