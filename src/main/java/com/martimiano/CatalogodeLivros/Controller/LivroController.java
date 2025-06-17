package com.martimiano.CatalogodeLivros.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.martimiano.CatalogodeLivros.Model.LivroModel;
import com.martimiano.CatalogodeLivros.Service.LivroService;

@RestController
@RequestMapping("/livro")
public class LivroController {

    /*cadastrar-, atualizar-, deletar-*/
    
    @Autowired
    private LivroService service;

    @PostMapping("/cadastrar")
    public ResponseEntity<LivroModel> cadastrarLivro(LivroModel livroModel){
        LivroModel livroCadastrado = service.cadastrarLivroModel(livroModel);
        return ResponseEntity.ok().body(livroCadastrado);
    }

    public ResponseEntity<LivroModel> atualizarLivro(@PathVariable Long id, LivroModel livroModelAtualizado){
        LivroModel livroModel = service.atualizarLivroModel(id, livroModelAtualizado);
        return ResponseEntity.ok().body(livroModel);
    }

}
