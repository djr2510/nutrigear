package br.com.cesrc.seusuas.repository;

import br.com.cesrc.seusuas.model.artigo.ArtigoModel;
import br.com.cesrc.seusuas.model.receita.ReceitaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReceitaRepository extends JpaRepository<ReceitaModel, Long> {

    //Procurar por titulo
    @Query("SELECT a FROM ReceitaModel a WHERE a.titulo LIKE %:titulo%")
    List<ReceitaModel> findByNomeContaining(@Param("titulo") String titulo);

    //Procurar por data criação Asc
    @Query("SELECT a FROM ReceitaModel a ORDER BY a.dataCriacao ASC")
    List<ReceitaModel> findAllOrderBydataCriacaoAsc();

    //Procurar por data criação Desc
    @Query("SELECT a FROM ReceitaModel a ORDER BY a.dataCriacao DESC")
    List<ReceitaModel> findAllOrderBydataCriacaoDesc();
}
