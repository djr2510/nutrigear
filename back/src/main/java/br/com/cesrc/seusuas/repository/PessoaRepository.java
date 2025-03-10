package br.com.cesrc.seusuas.repository;

import br.com.cesrc.seusuas.model.artigo.ArtigoModel;
import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repositório JPA para a entidade PessoaModel.
 * Fornece métodos para realizar operações de persistência e consulta no banco de dados para pessoas.
 */
@Repository
public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {

    @Query("SELECT p FROM PessoaModel p WHERE p.email = :email AND p.senha = :senha")
    List<PessoaModel> findByEmailAndSenha(@Param("email") String email, @Param("senha") String senha);
}
