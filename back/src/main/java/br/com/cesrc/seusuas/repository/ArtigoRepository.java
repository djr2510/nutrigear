package br.com.cesrc.seusuas.repository;

import br.com.cesrc.seusuas.model.artigo.ArtigoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtigoRepository extends JpaRepository<ArtigoModel, Long> {

    // Procurar por título (com busca parcial)
    @Query("SELECT a FROM ArtigoModel a WHERE a.titulo LIKE %:titulo%")
    List<ArtigoModel> findByTituloContaining(@Param("titulo") String titulo);

    // Procurar por data criação Ascendente
    @Query("SELECT a FROM ArtigoModel a ORDER BY a.dataCriacao ASC")
    List<ArtigoModel> findAllOrderByDataCriacaoAsc();

    // Procurar por data criação Descendente
    @Query("SELECT a FROM ArtigoModel a ORDER BY a.dataCriacao DESC")
    List<ArtigoModel> findAllOrderByDataCriacaoDesc();
}
