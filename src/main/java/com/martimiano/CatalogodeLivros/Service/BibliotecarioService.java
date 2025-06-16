package com.martimiano.CatalogodeLivros.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.martimiano.CatalogodeLivros.Model.BibliotecarioModel;
import com.martimiano.CatalogodeLivros.Repository.BibliotecarioRepository;

@Service
public class BibliotecarioService {

    @Autowired
    private BibliotecarioRepository repository;

    /*cadastrar-, atualizar-, deletar-*/

    public BibliotecarioModel cadastrarBibliotecarioModel(BibliotecarioModel bibliotecarioModel){
        return repository.save(bibliotecarioModel);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public BibliotecarioModel atualizarBibliotecarioModel(Long id, BibliotecarioModel bibliotecarioModelAlterado) {
        BibliotecarioModel bibliotecarioModelAtual = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Bibliotecario não encontrado com id: " + id));       
        bibliotecarioModelAtual.setNome(bibliotecarioModelAlterado.getNome());
        bibliotecarioModelAtual.setEmail(bibliotecarioModelAlterado.getEmail());
        return repository.save(bibliotecarioModelAtual);
    }

}
