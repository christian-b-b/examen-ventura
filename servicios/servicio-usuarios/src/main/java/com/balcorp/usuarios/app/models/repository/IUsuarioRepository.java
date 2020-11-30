package com.balcorp.usuarios.app.models.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.balcorp.usuarios.commons.app.models.entiry.Usuario;

public interface IUsuarioRepository extends PagingAndSortingRepository<Usuario, Long>{

	public Usuario  findByUsername(String username);
	
	
}
