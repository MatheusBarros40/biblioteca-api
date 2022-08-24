package com.matheus.biblioteca.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Categoria {
    @EqualsAndHashCode.Include
    private Integer id;
    private String nome;
    private String description;

    private List<Livro> livros = new ArrayList<>();


    public Categoria() {
        super();
    }

    public Categoria(Integer id, String nome, String description) {
        super();
        this.id = id;
        this.nome = nome;
        this.description = description;
    }

}
