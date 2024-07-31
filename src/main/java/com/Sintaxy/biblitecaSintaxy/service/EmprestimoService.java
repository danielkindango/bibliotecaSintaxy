package com.Sintaxy.biblitecaSintaxy.service;

import com.Sintaxy.biblitecaSintaxy.model.Emprestimo;
import com.Sintaxy.biblitecaSintaxy.repository.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmprestimoService {
    @Autowired
    private EmprestimoRepository emprestimoRepository;

    public List<Emprestimo> findAll() {
        return emprestimoRepository.findAll();
    }

    public Emprestimo findById(Long id) {
        return emprestimoRepository.findById(id).orElse(null);
    }

    public Emprestimo save(Emprestimo emprestimo) {
        return emprestimoRepository.save(emprestimo);
    }

    public void deleteById(Long id) {
        emprestimoRepository.deleteById(id);
    }
}
