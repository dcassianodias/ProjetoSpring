package br.com.primeiroprojetospring.security;

public enum ESecurityConstants {
	//Chave SECRET
	SECRET("primeiroProjetoSpring"),
	//PREFIXO BEARES
	TOKEN_PREFIX("Bearer "),
	//TAG HEADER
	HEADER("Authorization");
	
	//TEMPO EM MILISEGUNDOS EXPIRAR TOKEN 600000 = 10 min
	static final long EXPIRATION_TIME = 600001;
	
	private String description;
	
	ESecurityConstants(String description) {
		this.description = description;
	}
	
	public String desc( ) {
		return this.description;
	}

}
