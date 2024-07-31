package com.Sintaxy.biblitecaSintaxy.repository;

import com.Sintaxy.biblitecaSintaxy.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
