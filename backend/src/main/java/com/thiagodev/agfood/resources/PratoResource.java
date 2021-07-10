package com.thiagodev.agfood.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thiagodev.agfood.domain.Prato;
import com.thiagodev.agfood.services.PratoService;

@RestController
@RequestMapping(value = "/pratos")
public class PratoResource {

	@Autowired
	private PratoService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> listar(@PathVariable Integer id) {
		Prato obj = service.buscar(id);

		return ResponseEntity.ok().body(obj);
	}

}
