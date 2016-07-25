package br.com.tiagoDeveloper.controllerRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiagoDeveloper.dao.GenericDAO;
import br.com.tiagoDeveloper.model.Anuncio;
import br.com.tiagoDeveloper.model.Anuncios;

@RestController
public class RestControler {
	
	
	@Autowired
	private GenericDAO<Anuncio> dao;


	
	
	@RequestMapping(value="xml/{id}", method = RequestMethod.GET, produces = "application/xml")
	public Anuncio retornoUnicoXML(@PathVariable Long id){
		
		Anuncio a = new Anuncio();
		a.setId(id);
		
		return dao.pesquisa(a) ;
		
	}
	
	@RequestMapping(value="xml", method = RequestMethod.GET, produces = "application/xml")
	public Anuncios retornotesteXML(){
		
		Anuncios a = new Anuncios();
		a.setAnuncios(dao.seleciona());
		return  a;
		
	}
	

	
	@RequestMapping(value="jsonId", produces = "application/json")
	public Anuncio retornoUnicoJSON(Long id){
		
		Anuncio a = new Anuncio();
		a.setId(id);
		
		return dao.pesquisa(a) ;
		
	}
	
	@RequestMapping(value="json", method = RequestMethod.GET, produces = "application/json")
	public Anuncios retornoJSON(){
		
		Anuncios a = new Anuncios();
		a.setAnuncios(dao.seleciona());
	
		return a;
		
	}
	

}
