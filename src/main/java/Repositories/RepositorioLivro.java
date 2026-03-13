package Repositories;

import Entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioLivro extends JpaRepository<Livro,Long> {
}
