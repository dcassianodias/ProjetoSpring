package br.com.primeiroprojetospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.primeiroprojetospring.domain.Chave;

@Repository
public interface ChaveRepository extends JpaRepository<Chave, Integer> {

	void deleteByCodigo(String codigo);	

}
