package com.martimiano.CatalogodeLivros.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.martimiano.CatalogodeLivros.Model.BibliotecarioModel;
import com.martimiano.CatalogodeLivros.Service.BibliotecarioService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/bibliotecario")
public class BibliotecarioController {

    @Autowired
    private BibliotecarioService service;
    /*listar-, buscarPorID, salvar-, atualizar, deletar*/
    @GetMapping
    public List<BibliotecarioModel> listaBibliotecarioModels() {
        return service.listar();
    }
    
    @PostMapping
    public BibliotecarioModel salvar(@RequestBody BibliotecarioModel bibliotecarioModel) {
        return service.salvar(bibliotecarioModel);
    }
    
    @PostMapping("/{id}")
    public BibliotecarioModel atualizarBibliotecarioModel(@ResponseBody BibliotecarioModel bibliotecarioModel){

        
        return service.buscarPorId(Long Id);
    }

    
    @GetMapping("/{id}")
    public BibliotecarioModel buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(Long id);
    }
    
    @DeleteMapping("/{id}")
    
    
}
