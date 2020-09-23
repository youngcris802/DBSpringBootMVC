package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class UsersController {
	
	@Autowired
	private UsersMapper usersMapper;
	
	@RequestMapping(value = "/users", method= RequestMethod.GET)
	public ModelAndView demo(ModelAndView mv) {
	mv.addObject("result", usersMapper.findAll());
	mv.setViewName("userslist"); //jspName
	return mv;
	}
}
