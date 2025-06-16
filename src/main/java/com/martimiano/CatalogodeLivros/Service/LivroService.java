package com.martimiano.CatalogodeLivros.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.martimiano.CatalogodeLivros.Repository.LivroRepository;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    /*salvar-, atualizar, deletar*/

    public LivroModel atualizar(Long id, LivroModel livroModelAlterado){
        LivroModel LivroModelAtual = findById(id);
        livroModelAtual.setTitulo(livroModelAlterado.getTitulo());
        livroModelAtual.setAutor(livroModelAlterado.getAutor());
        
    }
}
