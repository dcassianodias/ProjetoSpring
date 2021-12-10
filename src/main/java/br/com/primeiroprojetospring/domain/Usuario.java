package br.com.primeiroprojetospring.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Getter;
import lombok.Setter;

public class Usuario implements UserDetails, Serializable {


	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2743693968070903931L;
	
	@Id
	private String login;
	private String password;
	
	@Setter
	@Getter
	private String nomeCompleto;

	@Override
	public Collection <? extends GrantedAuthority> getAuthorities() {
		return new ArrayList<>();
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getUsername() {		
		return this.login;
	}

	@Override
	public boolean isAccountNonExpired() {		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {		
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {		
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}	
	
}
