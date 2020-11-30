package com.balcorp.oauth.app.models.clientes;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.balcorp.usuarios.commons.app.models.entiry.Usuario;

@FeignClient(name = "servicio-usuarios",url = "localhost:1001")
public interface IUsuarioClienteFeign {

	
	
	@GetMapping("/usuario/nombre_usuario/{usuario}")
	public Usuario detalle(@PathVariable String usuario);
}
