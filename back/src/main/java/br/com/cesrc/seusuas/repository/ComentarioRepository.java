package br.com.cesrc.seusuas.repository;

import br.com.cesrc.seusuas.model.comentario.ComentarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositório JPA para a entidade ComentarioModel.
 * Fornece métodos para realizar operações de persistência e consulta no banco de dados para comentários.
 */
public interface ComentarioRepository extends JpaRepository<ComentarioModel, Long> {


}