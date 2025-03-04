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


    @Query("SELECT a FROM AlimentoModel a ORDER BY a.vitamina ASC")
    List<AlimentoModel> findAllOrderByProteinasAsc();

    @Query("SELECT a FROM AlimentoModel a ORDER BY a.vitamina DESC")
    List<AlimentoModel> findAllOrderByProteinasDesc();

    List<AlimentoModel> findByAllFieldsWithVariation(String nome, TipoAlimento tipoAlimento, Integer gramaMin, Integer gramaMax, Integer valorEnergeticoMin, Integer valorEnergeticoMax, Integer carboidratosMin, Integer carboidratosMax, Integer acucaresTotaisMin, Integer acucaresTotaisMax, Integer acucaresAdicionaisMin, Integer acucaresAdicionaisMax, Integer proteinasMin, Integer proteinasMax, Integer gorduraTotaisMin, Integer gorduraTotaisMax, Integer gorduraTransMin, Integer gorduraTransMax, Integer gorduraSaturadaMin, Integer gorduraSaturadaMax, Integer fibraMin, Integer fibraMax, Integer sodioMin, Integer sodioMax, Integer vitaminaAMin, Integer vitaminaAMax, Integer vitaminaBMin, Integer vitaminaBMax, Integer vitaminaCMin, Integer vitaminaCMax, Integer vitaminaDMin, Integer vitaminaDMax, Integer vitaminaEMin, Integer vitaminaEMax, Integer vitaminaKMin, Integer vitaminaKMax);
}
