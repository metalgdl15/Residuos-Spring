package com.apiceno.Residuos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apiceno.Residuos.ImplServ.ResiduoImpl;
import com.apiceno.Residuos.entity.Residuo;

@Controller
public class ResiduosController {
	
	@Autowired
	private ResiduoImpl residuoServ;

	@RequestMapping("/residuo")
	public String createResiduo(Model model) {
		
		Residuo residuo = new Residuo();
		
		model.addAttribute("residuo", residuo);
		return "residuos";
	}
	
	@RequestMapping(value="/residuo/show", method=RequestMethod.POST)
	public String insertResiduo(@ModelAttribute("residuo") Residuo residuo, Model model) {
		System.out.println(residuoServ.insert(residuo));
		return "redirect:/residuo";
	}
}
