package com.matheus.biblioteca.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Livro implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;
    private String titulo;
    private String nome_autor;
    private String texto;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Livro() {
        super();
    }

    public Livro(Integer id, String titulo, String nome_autor, String texto, Categoria categoria) {
        super();
        this.id = id;
        this.titulo = titulo;
        this.nome_autor = nome_autor;
        this.texto = texto;
        this.categoria = categoria;
    }
}
