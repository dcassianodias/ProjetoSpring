package br.com.primeiroprojetospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/principal")
public class PrincipalController {

	@GetMapping
	public ModelAndView chamaPaginaPrincipal() {
		ModelAndView mview = new ModelAndView("index");
		return mview;
	}
	
	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mview = new ModelAndView("login");
		return mview;
	
}
}
