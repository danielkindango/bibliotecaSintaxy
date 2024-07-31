package com.Sintaxy.biblitecaSintaxy.controller;

import com.Sintaxy.biblitecaSintaxy.model.Emprestimo;
import com.Sintaxy.biblitecaSintaxy.service.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/emprestimos")
public class EmprestimoController {
    @Autowired
    private EmprestimoService emprestimoService;

    @GetMapping
    public List<Emprestimo> getAllEmprestimos() {
        return emprestimoService.findAll();
    }

    @GetMapping("/{id}")
    public Emprestimo getEmprestimoById(@PathVariable Long id) {
        return emprestimoService.findById(id);
    }

    @PostMapping
    public Emprestimo createEmprestimo(@RequestBody Emprestimo emprestimo) {
        return emprestimoService.save(emprestimo);
    }

    @PutMapping("/{id}")
    public Emprestimo updateEmprestimo(@PathVariable Long id, @RequestBody Emprestimo emprestimo) {
        emprestimo.setId(id);
        return emprestimoService.save(emprestimo);
    }

    @DeleteMapping("/{id}")
    public void deleteEmprestimo(@PathVariable Long id) {
        emprestimoService.deleteById(id);
    }
}
