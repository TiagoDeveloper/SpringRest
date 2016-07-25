package br.com.tiagoDeveloper.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Anuncio {

	@Id
	@GeneratedValue
	@XmlAttribute
	private Long id;
	@XmlElement
	private String titulo;
	@XmlElement
	private String descricao;
	@XmlElement
	@ManyToOne
	private Empresa empresa;
	
	public Anuncio() {
		// TODO Auto-generated constructor stub
	}
	
	public Anuncio(Long id, String titulo, String descricao, Empresa empresa) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.empresa = empresa;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return "Anuncio [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", empresa=" + empresa + "]";
	}


}
