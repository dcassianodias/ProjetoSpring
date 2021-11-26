package br.com.primeiroprojetospring.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "TABELA_ALUNO")
public class Aluno implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -886604392341594251L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ALUNO")
	private Integer id;
	
	@Column(nome="ALUNO_NOME")
	private String nome;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
