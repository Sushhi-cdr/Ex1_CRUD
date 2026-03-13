package com.example.Ex1.Repositories;

import com.example.Ex1.Entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioLivro extends JpaRepository<Livro,Long> {
}
