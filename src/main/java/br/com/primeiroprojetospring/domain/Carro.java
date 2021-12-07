package br.com.primeiroprojetospring.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Carro implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4999365715442116360L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;
	
	@Column(name="MODELO_CARRO")
	private String modelo;
	
	@OneToOne
	@JoinColumn(name = "ID_CHAVE")
	private Chave chaveCarro;
	
	@OneToOne
	@JoinColumn(name = "ID_DOCUMENTO")
	private Chave documentoCarro;
	
	@ManyToOne
	@JoinColumn(name="ID_FABRICANTE")
	private Fabricante fabricanteCarro;
	
	@ManyToMany
	@JoinTable(name = "REL_CARRO_ACESSORIO", 
	joinColumns = { @JoinColumn(name = "ID_CARRO") }, 
	inverseJoinColumns = {@JoinColumn(name = "ID_ACESSORIO") }
	)
	
	private List<Acessorio> acessorios;

	public Chave getDocumentoCarro() {
		return documentoCarro;
	}

	public void setDocumentoCarro(Chave documentoCarro) {
		this.documentoCarro = documentoCarro;
	}

	public Fabricante getFabricanteCarro() {
		return fabricanteCarro;
	}

	public void setFabricanteCarro(Fabricante fabricanteCarro) {
		this.fabricanteCarro = fabricanteCarro;
	}

	public List<Acessorio> getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(List<Acessorio> acessorios) {
		this.acessorios = acessorios;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public Chave getChaveCarro() {
		return chaveCarro;
	}

	public void setChaveCarro(Chave chaveCarro) {
		this.chaveCarro = chaveCarro;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
	
	