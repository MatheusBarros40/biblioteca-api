package com.matheus.biblioteca.service;

import com.matheus.biblioteca.domain.Categoria;
import com.matheus.biblioteca.domain.Livro;
import com.matheus.biblioteca.repository.CategoriaRepository;
import com.matheus.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private LivroRepository livroRepository;

    public void instanciaDB(){
        Categoria cat1 = new Categoria(null, "Informatica", "Livros de TI");
        Categoria cat2 = new Categoria(null, "Ficção Cientifica", "Ficção Cientifica");
        Categoria cat3 = new Categoria(null, "Biografias", "Livros de Biografias");

        Livro l1 = new Livro(null, "CLean Code", "Robert Martin", "Lorem ipsum", cat1);
        Livro l2= new Livro(null, "Engenharia de Software", "Louis V. Gerstner", "Lorem ipsum", cat1);
        Livro l3 = new Livro(null, "The Time Machine", "H.G. Wells", "Lorem ipsum", cat2);
        Livro l4 = new Livro(null, "The War of the Worlds", "H.G. Wells", "Lorem ipsum", cat2);
        Livro l5 = new Livro(null, "Biografia Cezar", "Cezar Martin", "Lorem ipsum", cat3);

        cat1.getLivros().addAll(Arrays.asList(l1, l2));
        cat2.getLivros().addAll(Arrays.asList(l3, l4));
        cat3.getLivros().addAll(Arrays.asList(l5));

        this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        this.livroRepository.saveAll(Arrays.asList(l1,l2,l3,l4,l5));

    }
}
