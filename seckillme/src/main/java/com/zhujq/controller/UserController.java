package com.zhujq.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zhujq.service.UserService;

@Controller
public class UserController {
	@Resource  
    private UserService userService;
	
	@RequestMapping("/showUser")
	public ModelAndView showUser(HttpServletRequest request,Model model){
		return new ModelAndView();
	}
	
	@RequestMapping(value = "/login")
	public String login(HttpServletRequest request,Model model){
		return "login";
	}
}
