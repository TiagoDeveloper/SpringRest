package br.com.tiagoDeveloper.dao;

import java.util.List;

public interface GenericDAO<T> {

	public void insere(T t);
	public List<T> seleciona();
	public T pesquisa(T t);
	public void deleta(T t);
	
}
