package com.martimiano.CatalogodeLivros.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.martimiano.CatalogodeLivros.Model.BibliotecarioModel;
import com.martimiano.CatalogodeLivros.Service.BibliotecarioService;



@RestController
@RequestMapping("/bibliotecario")
public class BibliotecarioController {

    @Autowired
    private BibliotecarioService service;

    /*(create) POST - salvar, (update) POST - atualizar, (delete) DELETE - excluir*/
    @GetMapping
    public List<BibliotecarioModel> listaBibliotecarioModels() {
        return service.listar();
    }
    
    @PostMapping
    public BibliotecarioModel salvar(@RequestBody BibliotecarioModel bibliotecarioModel) {
        return service.salvar(bibliotecarioModel);
    }
    

}
