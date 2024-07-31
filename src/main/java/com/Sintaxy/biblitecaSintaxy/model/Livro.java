package com.Sintaxy.biblitecaSintaxy.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;

    @OneToMany(mappedBy = "livro")
    private List<Emprestimo> emprestimos;

    public Livro(Long id, String titulo, Autor autor, List<Emprestimo> emprestimos) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.emprestimos = emprestimos;
    }

    public Livro(String titulo, Autor autor, List<Emprestimo> emprestimos) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestimos = emprestimos;
    }

    public Livro() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", emprestimos=" + emprestimos +
                '}';
    }
}


