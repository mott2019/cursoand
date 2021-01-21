package com.andremott.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.andremott.cursomc.domain.Categoria;
import com.andremott.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
public class CursoandApplication implements CommandLineRunner {
	
	/*salvar o objeto no banco de dados*/
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursoandApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		 Categoria cat1 = new Categoria(null, "Informática");
		 Categoria cat2 = new Categoria(null, "Escritório");
		 
		 categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		 
	}

}
