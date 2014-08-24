package com.teddy.springtest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	


	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("msg", "Hello Index");
		modelView.setViewName("index");
		System.err.println("Ö´ÐÐindex£¡");
		return modelView;
	}

	@RequestMapping("/show")
	public ModelAndView show(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("msg", "Hello show");
		modelView.setViewName("index");
		System.err.println("Ö´ÐÐshow£¡");
		return modelView;
	}
}
