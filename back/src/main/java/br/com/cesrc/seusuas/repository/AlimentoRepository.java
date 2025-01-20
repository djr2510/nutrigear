package br.com.cesrc.seusuas.repository;

import br.com.cesrc.seusuas.model.alimento.AlimentoModel;
import br.com.cesrc.seusuas.model.alimento.TipoAlimento;
import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlimentoRepository extends JpaRepository<AlimentoModel, Long> {
    @Query("SELECT a FROM AlimentoModel a WHERE a.nome LIKE %:nome%")
    List<AlimentoModel> findByNomeContaining(@Param("nome") String nome);
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.vitaminaA DESC")
    List<AlimentoModel> findAllOrderByVitaminaADesc();
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.vitaminaB DESC")
    List<AlimentoModel> findAllOrderByVitaminaBDesc();
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.vitaminaC DESC")
    List<AlimentoModel> findAllOrderByVitaminaCDesc();
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.vitaminaD DESC")
    List<AlimentoModel> findAllOrderByVitaminaDDesc();
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.vitaminaE DESC")
    List<AlimentoModel> findAllOrderByVitaminaEDesc();
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.vitaminaK DESC")
    List<AlimentoModel> findAllOrderByVitaminaKDesc();
    @Query("SELECT a FROM AlimentoModel a WHERE a.tipo = :tipo")
    List<AlimentoModel> findByTipo(@Param("tipo") TipoAlimento tipoAlimento);
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.proteinas DESC")
    List<AlimentoModel> findAllOrderByProteinasDesc();



}
