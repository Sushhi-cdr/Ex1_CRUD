package com.example.Ex1.Controllers;

import com.example.Ex1.Entity.Livro;
import com.example.Ex1.Services.ServicoLivro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class ControleLivro {

    @Autowired
    private ServicoLivro servico;

    @PostMapping
    public Livro criar(@RequestBody Livro livro){
        return servico.criar(livro);
    }

    @GetMapping
    public List<Livro> listar(){
        return servico.listar();
    }

    @GetMapping("/{id}")
    public Livro buscar(@PathVariable Long id){
        return servico.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id){
        servico.remover(id);
    }
}
