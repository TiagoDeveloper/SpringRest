package br.com.tiagoDeveloper.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.tiagoDeveloper.model.Anuncio;


@Transactional
@Repository
public class AnuncioDAO implements GenericDAO<Anuncio> {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public void insere(Anuncio t) {

		this.manager.persist(t);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Anuncio> seleciona() {
		
		return (List<Anuncio>) this.manager.createQuery("select a from Anuncio a").getResultList();
	}

	@Override
	public Anuncio pesquisa(Anuncio t) {
		
		return manager.find(Anuncio.class, t.getId());
	}

	@Override
	public void deleta(Anuncio t) {
		// TODO Auto-generated method stub
		
	}

}
