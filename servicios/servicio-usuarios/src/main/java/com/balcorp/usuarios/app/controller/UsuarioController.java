package com.balcorp.usuarios.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.balcorp.usuarios.commons.app.models.entiry.Usuario;
import com.balcorp.usuarios.app.models.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/listar")
	public List<Usuario> listar() {
		return usuarioService.findAll();
	}

	@GetMapping("/ver/{id}")
	public Usuario ver(@PathVariable Long id) {
		return usuarioService.findById(id);
	}
	
	@GetMapping("/nombre_usuario/{usuario}")
	public Usuario detalle(@PathVariable String usuario) {
		return usuarioService.findByUsername(usuario);
	}

	@PostMapping("/guardar")
	public Usuario guardar(@RequestBody Usuario usuario) {
		return usuarioService.save(usuario);
	}

	@PutMapping("/update/{id}")
	public Usuario actualizar(Usuario usuario) {
		return usuarioService.save(usuario);
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Long id) {
		usuarioService.deleteById(id);
	}
}
