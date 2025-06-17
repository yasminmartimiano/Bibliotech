package com.martimiano.CatalogodeLivros.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.martimiano.CatalogodeLivros.Model.LivroModel;
import com.martimiano.CatalogodeLivros.Repository.LivroRepository;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    /*cadastrar- pronto, atualizar- pronto, deletar- pronto*/

    public LivroModel cadastrarLivroModel(LivroModel livroModel){
        return repository.save(livroModel);
    }
    
    public LivroModel atualizarLivroModel(Long id, LivroModel livroModelAlterado){
        LivroModel livroModelAtual = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Livro não encontrado pelo id: " + id));
        livroModelAtual.setTitulo(livroModelAlterado.getTitulo());
        livroModelAtual.setAutor(livroModelAlterado.getAutor());
        livroModelAtual.setGenero(livroModelAlterado.getGenero());
        livroModelAtual.setStatus(livroModelAlterado.getStatus());
        livroModelAtual.setData(livroModelAlterado.getData());
        return repository.save(livroModelAtual);
    }

    public void deletarLivro(Long id){
        repository.deleteById(id);
    }
}
