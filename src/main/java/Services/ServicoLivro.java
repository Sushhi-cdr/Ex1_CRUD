package Services;

import Entity.Livro;
import Repositories.RepositorioLivro;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoLivro {

    private final RepositorioLivro repositorioLivro;

    public ServicoLivro(RepositorioLivro repositorioLivro) {
        this.repositorioLivro = repositorioLivro;
    }

    public Livro criar(Livro livro){
        return this.repositorioLivro.save(livro);
    }

    public List<Livro> listar(){
        return this.repositorioLivro.findAll();
    }

    public Livro buscarPorId(Long id){
        return this.repositorioLivro.findById(id).get();
    }

    public void remover(Long id){
        this.repositorioLivro.deleteById(id);
    }
}
