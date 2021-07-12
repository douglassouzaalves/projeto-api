package br.com.projetoapi.projetolivraria.controller;

import br.com.projetoapi.projetolivraria.model.Livro;
import br.com.projetoapi.projetolivraria.service.LivroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@RestController
@RequestMapping("livros")
public class LivroController {

    @Autowired
    LivroService service;

    @PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> save(@RequestBody Livro livro) {
        try {
            service.save(livro);
            return ResponseEntity.status(HttpStatus.CREATED).body(livro);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocorreu um erro inesperado");
        }
    }


    @PutMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> update(@RequestBody Livro livro) {
        try {
            service.update(livro);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(livro);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocorreu um erro inesperado");
        }
    }


    @DeleteMapping(path = "/{livroId}")
    public ResponseEntity<?> delete(@PathVariable("livroId") Long livroId) {
        try {
            service.delete(livroId);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocorreu um erro inesperado");
        }
    }


    @GetMapping(path = "/")
    public ResponseEntity<?> select() {
        try {
            List<Livro> livros = service.select();
            return ResponseEntity.status(HttpStatus.OK).body(livros);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocorreu um erro inesperado");
        }
    }
}

