package com.Sintaxy.biblitecaSintaxy.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String livro;

    @OneToMany(mappedBy = "autor")
    private List<Livro> livros;

    public Autor(Long id, String nome, String livro, List<Livro> livros) {
        this.id = id;
        this.nome = nome;
        this.livro = livro;
        this.livros = livros;
    }

    public Autor(String nome, String livro, List<Livro> livros) {
        this.nome = nome;
        this.livro = livro;
        this.livros = livros;
    }

    public Autor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", livro='" + livro + '\'' +
                ", livros=" + livros +
                '}';
    }

    // hashCode and equals
}


