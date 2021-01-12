package com.apiceno.Residuos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("sessionData")
public class IndexController {

	@RequestMapping("/")
	public String Index() {
		return "index";
	}
}
