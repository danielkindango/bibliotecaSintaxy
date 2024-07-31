package com.Sintaxy.biblitecaSintaxy.controller;

import com.Sintaxy.biblitecaSintaxy.model.Autor;
import com.Sintaxy.biblitecaSintaxy.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {
    @Autowired
    private AutorService autorService;

    @GetMapping
    public List<Autor> getAllAutores() {
        return autorService.findAll();
    }

    @GetMapping("/{id}")
    public Autor getAutorById(@PathVariable Long id) {
        return autorService.findById(id);
    }

    @PostMapping
    public Autor createAutor(@RequestBody Autor autor) {
        return autorService.save(autor);
    }

    @PutMapping("/{id}")
    public Autor updateAutor(@PathVariable Long id, @RequestBody Autor autor) {
        autor.setId(id);
        return autorService.save(autor);
    }

    @DeleteMapping("/{id}")
    public void deleteAutor(@PathVariable Long id) {
        autorService.deleteById(id);
    }
}
