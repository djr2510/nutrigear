package br.com.cesrc.seusuas.repository;

import br.com.cesrc.seusuas.model.alimento.AlimentoModel;
import br.com.cesrc.seusuas.model.alimento.TipoAlimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repositório JPA para a entidade AlimentoModel.
 * Fornece métodos para realizar operações de persistência e consulta no banco de dados para alimentos.
 */
@Repository
public interface AlimentoRepository extends JpaRepository<AlimentoModel, Long> {

    /**
     * Busca alimentos por nome, contendo a string fornecida.
     *
     * @param nome String a ser buscada no nome do alimento.
     * @return Lista de alimentos que contêm a string fornecida no nome.
     */
    @Query("SELECT a FROM AlimentoModel a WHERE a.nome LIKE %:nome%")
    List<AlimentoModel> findByNomeContaining(@Param("nome") String nome);

    /**
     * Busca alimentos por tipo.
     *
     * @param tipoAlimento Tipo de alimento a ser buscado.
     * @return Lista de alimentos do tipo fornecido.
     */
    @Query("SELECT a FROM AlimentoModel a WHERE a.tipo = :tipo")
    List<AlimentoModel> findByTipo(@Param("tipo") TipoAlimento tipoAlimento);

    /**
     * Busca alimentos por quantidade aproximada de vitamina A (variação de 10%).
     *
     * @param quantidade Quantidade de vitamina A a ser buscada.
     * @return Lista de alimentos com quantidade aproximada de vitamina A.
     */
    @Query("SELECT a FROM AlimentoModel a WHERE a.vitaminaA BETWEEN :quantidade * 0.9 AND :quantidade * 1.1")
    List<AlimentoModel> findByVitaminaA(@Param("quantidade") Double quantidade);

    /**
     * Busca alimentos por quantidade aproximada de vitamina B (variação de 10%).
     *
     * @param quantidade Quantidade de vitamina B a ser buscada.
     * @return Lista de alimentos com quantidade aproximada de vitamina B.
     */
    @Query("SELECT a FROM AlimentoModel a WHERE a.vitaminaB BETWEEN :quantidade * 0.9 AND :quantidade * 1.1")
    List<AlimentoModel> findByVitaminaB(@Param("quantidade") Double quantidade);

    /**
     * Busca alimentos por quantidade aproximada de vitamina C (variação de 10%).
     *
     * @param quantidade Quantidade de vitamina C a ser buscada.
     * @return Lista de alimentos com quantidade aproximada de vitamina C.
     */
    @Query("SELECT a FROM AlimentoModel a WHERE a.vitaminaC BETWEEN :quantidade * 0.9 AND :quantidade * 1.1")
    List<AlimentoModel> findByVitaminaC(@Param("quantidade") Double quantidade);

    /**
     * Busca alimentos por quantidade aproximada de vitamina D (variação de 10%).
     *
     * @param quantidade Quantidade de vitamina D a ser buscada.
     * @return Lista de alimentos com quantidade aproximada de vitamina D.
     */
    @Query("SELECT a FROM AlimentoModel a WHERE a.vitaminaD BETWEEN :quantidade * 0.9 AND :quantidade * 1.1")
    List<AlimentoModel> findByVitaminaD(@Param("quantidade") Double quantidade);

    /**
     * Busca alimentos por quantidade aproximada de vitamina E (variação de 10%).
     *
     * @param quantidade Quantidade de vitamina E a ser buscada.
     * @return Lista de alimentos com quantidade aproximada de vitamina E.
     */
    @Query("SELECT a FROM AlimentoModel a WHERE a.vitaminaE BETWEEN :quantidade * 0.9 AND :quantidade * 1.1")
    List<AlimentoModel> findByVitaminaE(@Param("quantidade") Double quantidade);

    /**
     * Busca alimentos por quantidade aproximada de vitamina K (variação de 10%).
     *
     * @param quantidade Quantidade de vitamina K a ser buscada.
     * @return Lista de alimentos com quantidade aproximada de vitamina K.
     */
    @Query("SELECT a FROM AlimentoModel a WHERE a.vitaminaK BETWEEN :quantidade * 0.9 AND :quantidade * 1.1")
    List<AlimentoModel> findByVitaminaK(@Param("quantidade") Double quantidade);

    /**
     * Busca todos os alimentos ordenados por quantidade de vitamina A crescente.
     *
     * @return Lista de alimentos ordenados por vitamina A crescente.
     */
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.vitaminaA ASC")
    List<AlimentoModel> findAllOrderByVitaminaAAsc();

    /**
     * Busca todos os alimentos ordenados por quantidade de vitamina B crescente.
     *
     * @return Lista de alimentos ordenados por vitamina B crescente.
     */
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.vitaminaB ASC")
    List<AlimentoModel> findAllOrderByVitaminaBAsc();

    /**
     * Busca todos os alimentos ordenados por quantidade de vitamina C crescente.
     *
     * @return Lista de alimentos ordenados por vitamina C crescente.
     */
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.vitaminaC ASC")
    List<AlimentoModel> findAllOrderByVitaminaCAsc();

    /**
     * Busca todos os alimentos ordenados por quantidade de vitamina D crescente.
     *
     * @return Lista de alimentos ordenados por vitamina D crescente.
     */
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.vitaminaD ASC")
    List<AlimentoModel> findAllOrderByVitaminaDAsc();

    /**
     * Busca todos os alimentos ordenados por quantidade de vitamina E crescente.
     *
     * @return Lista de alimentos ordenados por vitamina E crescente.
     */
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.vitaminaE ASC")
    List<AlimentoModel> findAllOrderByVitaminaEAsc();

    /**
     * Busca todos os alimentos ordenados por quantidade de vitamina K crescente.
     *
     * @return Lista de alimentos ordenados por vitamina K crescente.
     */
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.vitaminaK ASC")
    List<AlimentoModel> findAllOrderByVitaminaKAsc();

    /**
     * Busca todos os alimentos ordenados por quantidade de vitamina A decrescente.
     *
     * @return Lista de alimentos ordenados por vitamina A decrescente.
     */
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.vitaminaA DESC")
    List<AlimentoModel> findAllOrderByVitaminaADesc();

    /**
     * Busca todos os alimentos ordenados por quantidade de vitamina B decrescente.
     *
     * @return Lista de alimentos ordenados por vitamina B decrescente.
     */
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.vitaminaB DESC")
    List<AlimentoModel> findAllOrderByVitaminaBDesc();

    /**
     * Busca todos os alimentos ordenados por quantidade de vitamina C decrescente.
     *
     * @return Lista de alimentos ordenados por vitamina C decrescente.
     */
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.vitaminaC DESC")
    List<AlimentoModel> findAllOrderByVitaminaCDesc();

    /**
     * Busca todos os alimentos ordenados por quantidade de vitamina D decrescente.
     *
     * @return Lista de alimentos ordenados por vitamina D decrescente.
     */
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.vitaminaD DESC")
    List<AlimentoModel> findAllOrderByVitaminaDDesc();

    /**
     * Busca todos os alimentos ordenados por quantidade de vitamina E decrescente.
     *
     * @return Lista de alimentos ordenados por vitamina E decrescente.
     */
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.vitaminaE DESC")
    List<AlimentoModel> findAllOrderByVitaminaEDesc();

    /**
     * Busca todos os alimentos ordenados por quantidade de vitamina K decrescente.
     *
     * @return Lista de alimentos ordenados por vitamina K decrescente.
     */
    @Query("SELECT a FROM AlimentoModel a ORDER BY a.vitaminaK DESC")
    List<AlimentoModel> findAllOrderByVitaminaKDesc();


    @Query("SELECT a FROM AlimentoModel a ORDER BY a.proteinas ASC")
    List<AlimentoModel> findAllOrderByProteinasAsc();

    @Query("SELECT a FROM AlimentoModel a ORDER BY a.proteinas DESC")
    List<AlimentoModel> findAllOrderByProteinasDesc();
/**
    @Query("""
    SELECT a FROM AlimentoModel a
    WHERE (:nome IS NULL OR LOWER(a.nome) LIKE LOWER(CONCAT('%', :nome, '%')))
    AND (:tipoAlimento IS NULL OR a.tipoAlimento = :tipoAlimento)
    AND (:gramaMin IS NULL OR a.grama >= :gramaMin)
    AND (:gramaMax IS NULL OR a.grama <= :gramaMax)
    AND (:valorEnergeticoMin IS NULL OR a.valorEnergetico >= :valorEnergeticoMin)
    AND (:valorEnergeticoMax IS NULL OR a.valorEnergetico <= :valorEnergeticoMax)
    AND (:carboidratosMin IS NULL OR a.carboidratos >= :carboidratosMin)
    AND (:carboidratosMax IS NULL OR a.carboidratos <= :carboidratosMax)
    AND (:acucaresTotaisMin IS NULL OR a.acucaresTotais >= :acucaresTotaisMin)
    AND (:acucaresTotaisMax IS NULL OR a.acucaresTotais <= :acucaresTotaisMax)
    AND (:acucaresAdicionaisMin IS NULL OR a.acucaresAdicionais >= :acucaresAdicionaisMin)
    AND (:acucaresAdicionaisMax IS NULL OR a.acucaresAdicionais <= :acucaresAdicionaisMax)
    AND (:proteinasMin IS NULL OR a.proteinas >= :proteinasMin)
    AND (:proteinasMax IS NULL OR a.proteinas <= :proteinasMax)
    AND (:gorduraTotaisMin IS NULL OR a.gorduraTotais >= :gorduraTotaisMin)
    AND (:gorduraTotaisMax IS NULL OR a.gorduraTotais <= :gorduraTotaisMax)
    AND (:gorduraTransMin IS NULL OR a.gorduraTrans >= :gorduraTransMin)
    AND (:gorduraTransMax IS NULL OR a.gorduraTrans <= :gorduraTransMax)
    AND (:gorduraSaturadaMin IS NULL OR a.gorduraSaturada >= :gorduraSaturadaMin)
    AND (:gorduraSaturadaMax IS NULL OR a.gorduraSaturada <= :gorduraSaturadaMax)
    AND (:fibraMin IS NULL OR a.fibra >= :fibraMin)
    AND (:fibraMax IS NULL OR a.fibra <= :fibraMax)
    AND (:sodioMin IS NULL OR a.sodio >= :sodioMin)
    AND (:sodioMax IS NULL OR a.sodio <= :sodioMax)
    AND (:vitaminaAMin IS NULL OR a.vitaminaA >= :vitaminaAMin)
    AND (:vitaminaAMax IS NULL OR a.vitaminaA <= :vitaminaAMax)
    AND (:vitaminaBMin IS NULL OR a.vitaminaB >= :vitaminaBMin)
    AND (:vitaminaBMax IS NULL OR a.vitaminaB <= :vitaminaBMax)
    AND (:vitaminaCMin IS NULL OR a.vitaminaC >= :vitaminaCMin)
    AND (:vitaminaCMax IS NULL OR a.vitaminaC <= :vitaminaCMax)
    AND (:vitaminaDMin IS NULL OR a.vitaminaD >= :vitaminaDMin)
    AND (:vitaminaDMax IS NULL OR a.vitaminaD <= :vitaminaDMax)
    AND (:vitaminaEMin IS NULL OR a.vitaminaE >= :vitaminaEMin)
    AND (:vitaminaEMax IS NULL OR a.vitaminaE <= :vitaminaEMax)
    AND (:vitaminaKMin IS NULL OR a.vitaminaK >= :vitaminaKMin)
    AND (:vitaminaKMax IS NULL OR a.vitaminaK <= :vitaminaKMax)
""")
    List<AlimentoModel> findByAllFieldsWithVariation(
            @Param("nome") String nome,
            @Param("tipoAlimento") TipoAlimento tipoAlimento,
            @Param("gramaMin") Integer gramaMin, @Param("gramaMax") Integer gramaMax,
            @Param("valorEnergeticoMin") Integer valorEnergeticoMin, @Param("valorEnergeticoMax") Integer valorEnergeticoMax,
            @Param("carboidratosMin") Integer carboidratosMin, @Param("carboidratosMax") Integer carboidratosMax,
            @Param("acucaresTotaisMin") Integer acucaresTotaisMin, @Param("acucaresTotaisMax") Integer acucaresTotaisMax,
            @Param("acucaresAdicionaisMin") Integer acucaresAdicionaisMin, @Param("acucaresAdicionaisMax") Integer acucaresAdicionaisMax,
            @Param("proteinasMin") Integer proteinasMin, @Param("proteinasMax") Integer proteinasMax,
            @Param("gorduraTotaisMin") Integer gorduraTotaisMin, @Param("gorduraTotaisMax") Integer gorduraTotaisMax,
            @Param("gorduraTransMin") Integer gorduraTransMin, @Param("gorduraTransMax") Integer gorduraTransMax,
            @Param("gorduraSaturadaMin") Integer gorduraSaturadaMin, @Param("gorduraSaturadaMax") Integer gorduraSaturadaMax,
            @Param("fibraMin") Integer fibraMin, @Param("fibraMax") Integer fibraMax,
            @Param("sodioMin") Integer sodioMin, @Param("sodioMax") Integer sodioMax,
            @Param("vitaminaAMin") Integer vitaminaAMin, @Param("vitaminaAMax") Integer vitaminaAMax,
            @Param("vitaminaBMin") Integer vitaminaBMin, @Param("vitaminaBMax") Integer vitaminaBMax,
            @Param("vitaminaCMin") Integer vitaminaCMin, @Param("vitaminaCMax") Integer vitaminaCMax,
            @Param("vitaminaDMin") Integer vitaminaDMin, @Param("vitaminaDMax") Integer vitaminaDMax,
            @Param("vitaminaEMin") Integer vitaminaEMin, @Param("vitaminaEMax") Integer vitaminaEMax,
            @Param("vitaminaKMin") Integer vitaminaKMin, @Param("vitaminaKMax") Integer vitaminaKMax
    );
    */
}
