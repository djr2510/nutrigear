package br.com.cesrc.seusuas.repository;

import br.com.cesrc.seusuas.model.alimento.AlimentoModel;
import br.com.cesrc.seusuas.model.alimento.TipoAlimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlimentoRepository extends JpaRepository<AlimentoModel, Long> {

    @Query("SELECT a FROM AlimentoModel a WHERE a.nome LIKE %:nome%")
    List<AlimentoModel> findByNomeContaining(@Param("nome") String nome);
    @Query("SELECT a FROM AlimentoModel a WHERE a.tipo = :tipo")
    List<AlimentoModel> findByTipo(@Param("tipo") TipoAlimento tipoAlimento);

    // Busca aproximada por vitaminas (considerando uma variação de 10%)
    @Query("SELECT a FROM AlimentoModel a WHERE a.vitaminaA BETWEEN :quantidade * 0.9 AND :quantidade * 1.1")
    List<AlimentoModel> findByVitaminaA(@Param("quantidade") Double quantidade);
    @Query("SELECT a FROM AlimentoModel a WHERE a.vitaminaB BETWEEN :quantidade * 0.9 AND :quantidade * 1.1")
    List<AlimentoModel> findByVitaminaB(@Param("quantidade") Double quantidade);
    @Query("SELECT a FROM AlimentoModel a WHERE a.vitaminaC BETWEEN :quantidade * 0.9 AND :quantidade * 1.1")
    List<AlimentoModel> findByVitaminaC(@Param("quantidade") Double quantidade);
    @Query("SELECT a FROM AlimentoModel a WHERE a.vitaminaD BETWEEN :quantidade * 0.9 AND :quantidade * 1.1")
    List<AlimentoModel> findByVitaminaD(@Param("quantidade") Double quantidade);
    @Query("SELECT a FROM AlimentoModel a WHERE a.vitaminaE BETWEEN :quantidade * 0.9 AND :quantidade * 1.1")
    List<AlimentoModel> findByVitaminaE(@Param("quantidade") Double quantidade);
    @Query("SELECT a FROM AlimentoModel a WHERE a.vitaminaK BETWEEN :quantidade * 0.9 AND :quantidade * 1.1")
    List<AlimentoModel> findByVitaminaK(@Param("quantidade") Double quantidade);

    // Ordenação crescente das vitaminas
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.vitaminaA ASC")
    List<AlimentoModel> findAllOrderByVitaminaAAsc();
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.vitaminaB ASC")
    List<AlimentoModel> findAllOrderByVitaminaBAsc();
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.vitaminaC ASC")
    List<AlimentoModel> findAllOrderByVitaminaCAsc();
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.vitaminaD ASC")
    List<AlimentoModel> findAllOrderByVitaminaDAsc();
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.vitaminaE ASC")
    List<AlimentoModel> findAllOrderByVitaminaEAsc();
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.vitaminaK ASC")
    List<AlimentoModel> findAllOrderByVitaminaKAsc();

    // Ordenação decrescente das vitaminas
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

    // Ordenação por quantidade de proteínas (descrescente)
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.proteinas DESC")
    List<AlimentoModel> findAllOrderByProteinasDesc();

    // Ordenação por quantidade de proteínas (crescente)
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.proteinas ASC")
    List<AlimentoModel> findAllOrderByProteinasAsc();
}
