package com.matheus.biblioteca;

import com.matheus.biblioteca.domain.Categoria;
import com.matheus.biblioteca.domain.Livro;
import com.matheus.biblioteca.repository.CategoriaRepository;
import com.matheus.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BibliotecaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);
	}

}
