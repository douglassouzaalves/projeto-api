package br.com.projetoapi.projetolivraria.service;

import br.com.projetoapi.projetolivraria.model.Livro;
import br.com.projetoapi.projetolivraria.model.LivroMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    LivroMapper mapper;

    public void save(Livro livro) {
        this.mapper.insert(livro);
    }


    public void update(Livro livro) {
        this.mapper.update(livro);
    }


    public void delete(Long livroId) {
        this.mapper.delete(livroId);
    }


    public List<Livro> select() {
        List<Livro> livros = this.mapper.select();
        return livros;
    }
}
