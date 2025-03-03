package br.com.cesrc.seusuas.repository;

import br.com.cesrc.seusuas.model.receita.ReceitaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReceitaRepository extends JpaRepository<ReceitaModel, Long> {

    @Query("SELECT r FROM ReceitaModel r WHERE LOWER(r.titulo) LIKE LOWER(CONCAT('%', :titulo, '%'))")
    List<ReceitaModel> findByTituloContainingIgnoreCase(@Param("titulo") String titulo);

    @Query("SELECT r FROM ReceitaModel r ORDER BY r.dataCriacao ASC")
    List<ReceitaModel> findAllByOrderByDataCriacaoAsc();

    @Query("SELECT r FROM ReceitaModel r ORDER BY r.dataCriacao DESC")
    List<ReceitaModel> findAllByOrderByDataCriacaoDesc();

    @Query("SELECT r FROM ReceitaModel r JOIN r.restricoesAlimentares ra WHERE ra = :restricao")
    List<ReceitaModel> findByRestricaoAlimentar(@Param("restricao") String restricao);

    @Query("SELECT r FROM ReceitaModel r JOIN r.opcoesAlimentares oa WHERE oa = :opcao")
    List<ReceitaModel> findByOpcaoAlimentar(@Param("opcao") String opcao);

    @Query("SELECT r FROM ReceitaModel r WHERE LOWER(r.titulo) LIKE LOWER(CONCAT('%', :titulo, '%')) OR LOWER(r.descricao) LIKE LOWER(CONCAT('%', :descricao, '%'))")
    List<ReceitaModel> findByTituloOrDescricao(@Param("titulo") String titulo, @Param("descricao") String descricao);
}
