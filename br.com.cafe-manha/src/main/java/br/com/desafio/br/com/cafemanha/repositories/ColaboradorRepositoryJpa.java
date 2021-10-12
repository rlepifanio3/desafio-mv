package br.com.desafio.br.com.cafemanha.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.desafio.br.com.cafemanha.model.Entity.ColaboradorEntity;

public interface ColaboradorRepositoryJpa extends JpaRepository<ColaboradorEntity, Integer> {
	
	boolean existsById(Integer idColaborador);
	
	@Query("SELECT c FROM ColaboradorEntity c WHERE c.idColaborador = ?1 ")
	Page<ColaboradorEntity> findByIdColaborador(Integer idColaborador);
	

}
