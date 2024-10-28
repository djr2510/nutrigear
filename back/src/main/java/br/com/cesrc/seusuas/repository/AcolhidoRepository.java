package br.com.cesrc.seusuas.repository;

import br.com.cesrc.seusuas.model.Acolhido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface AcolhidoRepository extends JpaRepository<Acolhido, Long> {
/**
    @Query("SELECT a FROM acolhido a WHERE a.nome LIKE '%:nome%'")
    List<Acolhido> findByNome(@Param("nome")String nome);
*/
    }
