package br.com.cesrc.seusuas.repository;

import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositório JPA para a entidade PessoaModel.
 * Fornece métodos para realizar operações de persistência e consulta no banco de dados para pessoas.
 */
@Repository
public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {

    // Métodos padrão do JpaRepository já fornecem as operações básicas de CRUD.
    // Métodos personalizados podem ser adicionados aqui se necessário.
}