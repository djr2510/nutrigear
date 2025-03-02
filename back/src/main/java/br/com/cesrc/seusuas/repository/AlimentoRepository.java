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

    // Teste
    @Query("SELECT a FROM AlimentoModel a WHERE " +
            "(a.nome LIKE %:nome% OR :nome IS NULL) AND " +
            "(a.tipo = :tipoAlimento OR :tipoAlimento IS NULL) AND " +
            "(a.grama BETWEEN :gramaMin * 0.9 AND :gramaMax * 1.1 OR :gramaMin IS NULL OR :gramaMax IS NULL) AND " +
            "(a.valorEnergetico BETWEEN :valorEnergeticoMin * 0.9 AND :valorEnergeticoMax * 1.1 OR :valorEnergeticoMin IS NULL OR :valorEnergeticoMax IS NULL) AND " +
            "(a.carboidratos BETWEEN :carboidratosMin * 0.9 AND :carboidratosMax * 1.1 OR :carboidratosMin IS NULL OR :carboidratosMax IS NULL) AND " +
            "(a.acucaresTotais BETWEEN :acucaresTotaisMin * 0.9 AND :acucaresTotaisMax * 1.1 OR :acucaresTotaisMin IS NULL OR :acucaresTotaisMax IS NULL) AND " +
            "(a.acucaresAdicionais BETWEEN :acucaresAdicionaisMin * 0.9 AND :acucaresAdicionaisMax * 1.1 OR :acucaresAdicionaisMin IS NULL OR :acucaresAdicionaisMax IS NULL) AND " +
            "(a.proteinas BETWEEN :proteinasMin * 0.9 AND :proteinasMax * 1.1 OR :proteinasMin IS NULL OR :proteinasMax IS NULL) AND " +
            "(a.gorduraTotais BETWEEN :gorduraTotaisMin * 0.9 AND :gorduraTotaisMax * 1.1 OR :gorduraTotaisMin IS NULL OR :gorduraTotaisMax IS NULL) AND " +
            "(a.gorduraTrans BETWEEN :gorduraTransMin * 0.9 AND :gorduraTransMax * 1.1 OR :gorduraTransMin IS NULL OR :gorduraTransMax IS NULL) AND " +
            "(a.gorduraSaturada BETWEEN :gorduraSaturadaMin * 0.9 AND :gorduraSaturadaMax * 1.1 OR :gorduraSaturadaMin IS NULL OR :gorduraSaturadaMax IS NULL) AND " +
            "(a.fibra BETWEEN :fibraMin * 0.9 AND :fibraMax * 1.1 OR :fibraMin IS NULL OR :fibraMax IS NULL) AND " +
            "(a.sodio BETWEEN :sodioMin * 0.9 AND :sodioMax * 1.1 OR :sodioMin IS NULL OR :sodioMax IS NULL) AND " +
            "(a.vitaminaA BETWEEN :vitaminaAMin * 0.9 AND :vitaminaAMax * 1.1 OR :vitaminaAMin IS NULL OR :vitaminaAMax IS NULL) AND " +
            "(a.vitaminaB BETWEEN :vitaminaBMin * 0.9 AND :vitaminaBMax * 1.1 OR :vitaminaBMin IS NULL OR :vitaminaBMax IS NULL) AND " +
            "(a.vitaminaC BETWEEN :vitaminaCMin * 0.9 AND :vitaminaCMax * 1.1 OR :vitaminaCMin IS NULL OR :vitaminaCMax IS NULL) AND " +
            "(a.vitaminaD BETWEEN :vitaminaDMin * 0.9 AND :vitaminaDMax * 1.1 OR :vitaminaDMin IS NULL OR :vitaminaDMax IS NULL) AND " +
            "(a.vitaminaE BETWEEN :vitaminaEMin * 0.9 AND :vitaminaEMax * 1.1 OR :vitaminaEMin IS NULL OR :vitaminaEMax IS NULL) AND " +
            "(a.vitaminaK BETWEEN :vitaminaKMin * 0.9 AND :vitaminaKMax * 1.1 OR :vitaminaKMin IS NULL OR :vitaminaKMax IS NULL)")
    List<AlimentoModel> findByAllFieldsWithVariation(
            @Param("nome") String nome,
            @Param("tipoAlimento") TipoAlimento tipoAlimento,
            @Param("gramaMin") Integer gramaMin,
            @Param("gramaMax") Integer gramaMax,
            @Param("valorEnergeticoMin") Integer valorEnergeticoMin,
            @Param("valorEnergeticoMax") Integer valorEnergeticoMax,
            @Param("carboidratosMin") Integer carboidratosMin,
            @Param("carboidratosMax") Integer carboidratosMax,
            @Param("acucaresTotaisMin") Integer acucaresTotaisMin,
            @Param("acucaresTotaisMax") Integer acucaresTotaisMax,
            @Param("acucaresAdicionaisMin") Integer acucaresAdicionaisMin,
            @Param("acucaresAdicionaisMax") Integer acucaresAdicionaisMax,
            @Param("proteinasMin") Integer proteinasMin,
            @Param("proteinasMax") Integer proteinasMax,
            @Param("gorduraTotaisMin") Integer gorduraTotaisMin,
            @Param("gorduraTotaisMax") Integer gorduraTotaisMax,
            @Param("gorduraTransMin") Integer gorduraTransMin,
            @Param("gorduraTransMax") Integer gorduraTransMax,
            @Param("gorduraSaturadaMin") Integer gorduraSaturadaMin,
            @Param("gorduraSaturadaMax") Integer gorduraSaturadaMax,
            @Param("fibraMin") Integer fibraMin,
            @Param("fibraMax") Integer fibraMax,
            @Param("sodioMin") Integer sodioMin,
            @Param("sodioMax") Integer sodioMax,
            @Param("vitaminaAMin") Integer vitaminaAMin,
            @Param("vitaminaAMax") Integer vitaminaAMax,
            @Param("vitaminaBMin") Integer vitaminaBMin,
            @Param("vitaminaBMax") Integer vitaminaBMax,
            @Param("vitaminaCMin") Integer vitaminaCMin,
            @Param("vitaminaCMax") Integer vitaminaCMax,
            @Param("vitaminaDMin") Integer vitaminaDMin,
            @Param("vitaminaDMax") Integer vitaminaDMax,
            @Param("vitaminaEMin") Integer vitaminaEMin,
            @Param("vitaminaEMax") Integer vitaminaEMax,
            @Param("vitaminaKMin") Integer vitaminaKMin,
            @Param("vitaminaKMax") Integer vitaminaKMax);
}

