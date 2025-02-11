package br.com.cesrc.seusuas.repository;

import br.com.cesrc.seusuas.model.alimento.AlimentoModel;
import br.com.cesrc.seusuas.model.artigo.ArtigoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtigoRepository extends JpaRepository<ArtigoModel, Long> {
    //Procurar por titulo
    @Query("SELECT a FROM ArtigoModel a WHERE a.titulo LIKE %:titulo%")
    List<ArtigoModel> findByNomeContaining(@Param("titulo") String titulo);

    //Procurar por data criação Asc
    @Query("SELECT a FROM ArtigoModel a ORDER BY a.dataCriacao ASC")
    List<ArtigoModel> findAllOrderBydataCriacaoAsc();

    //Procurar por data criação Desc
    @Query("SELECT a FROM ArtigoModel a ORDER BY a.dataCriacao DESC")
    List<ArtigoModel> findAllOrderBydataCriacaoDesc();
}
