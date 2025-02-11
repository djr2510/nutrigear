package br.com.cesrc.seusuas.repository;

import br.com.cesrc.seusuas.model.comentario.ComentarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepository extends JpaRepository<ComentarioModel, Long> {
}
