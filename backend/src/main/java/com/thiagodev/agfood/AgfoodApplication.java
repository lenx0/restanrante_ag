package com.thiagodev.agfood;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.thiagodev.agfood.domain.Prato;
import com.thiagodev.agfood.repositories.PratoRepository;
import com.thiagodev.agfood.repositories.UsuarioRepository;

@SpringBootApplication
public class AgfoodApplication implements CommandLineRunner {
	
	@Autowired
	private PratoRepository pratoRepository;
	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(AgfoodApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Prato prato1 = new Prato(null, "Segunda-Feira", "Carne Assada", "Pudim", "Suco de Uva");
		pratoRepository.saveAll(Arrays.asList(prato1));
	
	}

}
