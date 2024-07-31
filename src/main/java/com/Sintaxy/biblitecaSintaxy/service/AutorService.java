package com.Sintaxy.biblitecaSintaxy.service;

import com.Sintaxy.biblitecaSintaxy.model.Autor;
import com.Sintaxy.biblitecaSintaxy.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> findAll() {
        return autorRepository.findAll();
    }

    public Autor findById(Long id) {
        return autorRepository.findById(id).orElse(null);
    }

    public Autor save(Autor autor) {
        return autorRepository.save(autor);
    }

    public void deleteById(Long id) {
        autorRepository.deleteById(id);
    }
}
