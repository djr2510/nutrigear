package br.com.cesrc.seusuas.repository;

import br.com.cesrc.seusuas.model.receita.ReceitaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Repositório JPA para a entidade ReceitaModel.
 * Fornece métodos para realizar operações de persistência e consulta no banco de dados.
 */
public interface ReceitaRepository extends JpaRepository<ReceitaModel, Long> {

    /**
     * Busca receitas por título, ignorando maiúsculas e minúsculas.
     *
     * @param titulo Título da receita a ser buscada.
     * @return Lista de receitas que correspondem ao título fornecido.
     */
    @Query("SELECT r FROM ReceitaModel r WHERE LOWER(r.titulo) LIKE LOWER(CONCAT('%', :titulo, '%'))")
    List<ReceitaModel> findByTituloContainingIgnoreCase(@Param("titulo") String titulo);

    /**
     * Busca todas as receitas ordenadas por data de criação em ordem ascendente.
     *
     * @return Lista de todas as receitas ordenadas por data de criação ascendente.
     */
    @Query("SELECT r FROM ReceitaModel r ORDER BY r.dataCriacao ASC")
    List<ReceitaModel> findAllByOrderByDataCriacaoAsc();

    /**
     * Busca todas as receitas ordenadas por data de criação em ordem descendente.
     *
     * @return Lista de todas as receitas ordenadas por data de criação descendente.
     */
    @Query("SELECT r FROM ReceitaModel r ORDER BY r.dataCriacao DESC")
    List<ReceitaModel> findAllByOrderByDataCriacaoDesc();

    /**
     * Busca receitas por restrição alimentar.
     *
     * @param restricao Restrição alimentar a ser buscada.
     * @return Lista de receitas que correspondem à restrição alimentar fornecida.
     */
    @Query("SELECT r FROM ReceitaModel r JOIN r.restricoesAlimentares ra WHERE ra = :restricao")
    List<ReceitaModel> findByRestricaoAlimentar(@Param("restricao") String restricao);

    /**
     * Busca receitas por opção alimentar.
     *
     * @param opcao Opção alimentar a ser buscada.
     * @return Lista de receitas que correspondem à opção alimentar fornecida.
     */
    @Query("SELECT r FROM ReceitaModel r JOIN r.opcoesAlimentares oa WHERE oa = :opcao")
    List<ReceitaModel> findByOpcaoAlimentar(@Param("opcao") String opcao);

    /**
     * Busca receitas por título ou descrição, ignorando maiúsculas e minúsculas.
     *
     * @param titulo Título da receita a ser buscada.
     * @param descricao Descrição da receita a ser buscada.
     * @return Lista de receitas que correspondem ao título ou descrição fornecidos.
     */
    @Query("SELECT r FROM ReceitaModel r WHERE LOWER(r.titulo) LIKE LOWER(CONCAT('%', :titulo, '%')) OR LOWER(r.descricao) LIKE LOWER(CONCAT('%', :descricao, '%'))")
    List<ReceitaModel> findByTituloOrDescricao(@Param("titulo") String titulo, @Param("descricao") String descricao);
}