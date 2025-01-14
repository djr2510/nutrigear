package br.com.cesrc.seusuas.repository;

import br.com.cesrc.seusuas.model.alimento.AlimentoModel;
import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlimentoRepository extends JpaRepository<AlimentoModel, Long> {
}
