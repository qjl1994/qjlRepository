package com.example.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.BookDao;

@RestController
public class IndexController {
	
	@Autowired
	private BookDao bookDao;
	
	@RequestMapping(value="/bookNet",method=RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.addAttribute("bookList", bookDao.findAll());
		
		return "index";
	}
}
