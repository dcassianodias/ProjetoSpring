package br.com.primeiroprojetospring.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	
	