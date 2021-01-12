package com.apiceno.Residuos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpresaController {

	@RequestMapping("/Empresa")
	public String Index() {
		return "empresa";
	}
}
