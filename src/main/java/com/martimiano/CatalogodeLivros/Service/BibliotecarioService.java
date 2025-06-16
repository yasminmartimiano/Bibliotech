package com.martimiano.CatalogodeLivros.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.martimiano.CatalogodeLivros.Model.BibliotecarioModel;
import com.martimiano.CatalogodeLivros.Repository.BibliotecarioRepository;

@Service
public class BibliotecarioService {

    @Autowired
    private BibliotecarioRepository repository;

    /*salvar-, atualizar, deletar*/

    public List<BibliotecarioModel> listar(){
        return repository.findAll();
    }

    public BibliotecarioModel salvar(BibliotecarioModel bibliotecarioModel){
        return repository.save(bibliotecarioModel);
    }
    
    public void deletar(Long id){
        return repository.deleteById(id);
    }
}
