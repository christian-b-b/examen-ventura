package com.balcorp.usuarios.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balcorp.usuarios.commons.app.models.entiry.Usuario;
import com.balcorp.usuarios.app.models.repository.IUsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private IUsuarioRepository usuarioRepository;
	
	public List<Usuario> findAll(){
		return (List<Usuario>) usuarioRepository.findAll();
	}
	
	public Usuario findById(Long id) {
		return usuarioRepository.findById(id).orElse(null);
	}
	
	public Usuario findByUsername(String username) {
		return usuarioRepository.findByUsername(username);
	}
	
	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public void deleteById(Long id) {
		usuarioRepository.deleteById(id);
	}
	
}
