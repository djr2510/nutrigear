package br.com.cesrc.seusuas.repository;

import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {

    }
