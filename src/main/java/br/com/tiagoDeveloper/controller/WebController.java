package br.com.tiagoDeveloper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.tiagoDeveloper.dao.GenericDAO;
import br.com.tiagoDeveloper.model.Anuncio;


@Controller
public class WebController {
	
	@Autowired
	private GenericDAO<Anuncio> dao;

	@RequestMapping("home")
	public String home(Model model){

		model.addAttribute("anuncios", dao.seleciona());

		return "home";
		
	}
	

}
