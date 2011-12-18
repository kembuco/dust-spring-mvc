package com.fergiggles.giggledust;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/home/{name}", method = RequestMethod.GET)
	public String home(Model model, @PathVariable String name) {
		model.addAttribute("name", name);
		
		return "home";
	}	
}
