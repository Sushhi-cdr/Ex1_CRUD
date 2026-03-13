package com.example.Ex1.Services;

import com.example.Ex1.Entity.Livro;
import com.example.Ex1.Repositories.RepositorioLivro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoLivro {

    @Autowired
    private RepositorioLivro repositorioLivro;

    public Livro criar(Livro livro){
        return repositorioLivro.save(livro);
    }

    public List<Livro> listar(){
        return repositorioLivro.findAll();
    }

    public Livro buscarPorId(Long id){
        return repositorioLivro.findById(id).orElse(null);
    }

    public void remover(Long id){
        repositorioLivro.deleteById(id);
    }
}
