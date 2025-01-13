package br.com.cesrc.seusuas.repository;

import br.com.cesrc.seusuas.model.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {
/**
    @Query("SELECT a FROM acolhido a WHERE a.nome LIKE '%:nome%'")
    List<Acolhido> findByNome(@Param("nome")String nome);
*/
    }
