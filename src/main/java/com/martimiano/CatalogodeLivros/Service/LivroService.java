package com.martimiano.CatalogodeLivros.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.martimiano.CatalogodeLivros.Model.BibliotecarioModel;
import com.martimiano.CatalogodeLivros.Repository.LivroRepository;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    

    public BibliotecarioModel salvar(BibliotecarioModel bibliotecarioModel){
        return repository.save(bibliotecarioModel);
    }
    public BibliotecarioModel buscarPorId(Long id){
        return repository.findById(id);
    }

    public void deletar(Long id){
        return repository.deleteById();
    }
}
