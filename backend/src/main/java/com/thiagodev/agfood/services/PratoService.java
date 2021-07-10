package com.thiagodev.agfood.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagodev.agfood.domain.Prato;
import com.thiagodev.agfood.repositories.PratoRepository;

@Service
public class PratoService {
	
	@Autowired
	private PratoRepository repo;
	
	public Prato buscar(Integer id) {
		Optional<Prato> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
