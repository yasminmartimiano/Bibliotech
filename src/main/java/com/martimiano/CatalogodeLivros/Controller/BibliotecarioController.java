package com.martimiano.CatalogodeLivros.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.martimiano.CatalogodeLivros.Model.BibliotecarioModel;
import com.martimiano.CatalogodeLivros.Service.BibliotecarioService;



@RestController
@RequestMapping("/bibliotecario")
public class BibliotecarioController {

    /*cadastrar-, atualizar-, deletar-*/
    @Autowired
    private BibliotecarioService service;

    @PostMapping("/cadastrar")
    public ResponseEntity<BibliotecarioModel> cadastrarBibliotecario(BibliotecarioModel bibliotecarioModel){
        BibliotecarioModel bibliotecarioCadastrado = service.cadastrarBibliotecarioModel(bibliotecarioModel);
        return ResponseEntity.ok().body(bibliotecarioCadastrado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BibliotecarioModel> atualizarBibliotecario(@PathVariable Long id, @RequestBody BibliotecarioModel bibliotecarioModelAlterado){
        BibliotecarioModel bibliotecarioModel = service.atualizarBibliotecarioModel(id, bibliotecarioModelAlterado);
        return ResponseEntity.ok().body(bibliotecarioModel);
    }

    @DeleteMapping("/{id}")
    public void deletarBibliotecario(@PathVariable Long id){
       service.deletarBibliotecario(id);
    }
}
