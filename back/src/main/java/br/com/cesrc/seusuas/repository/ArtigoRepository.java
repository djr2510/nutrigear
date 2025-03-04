package br.com.cesrc.seusuas.repository;

import br.com.cesrc.seusuas.model.artigo.ArtigoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repositório JPA para a entidade ArtigoModel.
 * Fornece métodos para realizar operações de persistência e consulta no banco de dados para artigos.
 */
@Repository
public interface ArtigoRepository extends JpaRepository<ArtigoModel, Long> {

    /**
     * Busca artigos por título, contendo a string fornecida.
     *
     * @param titulo String a ser buscada no título do artigo.
     * @return Lista de artigos que contêm a string fornecida no título.
     */
    @Query("SELECT a FROM ArtigoModel a WHERE a.titulo LIKE %:titulo%")
    List<ArtigoModel> findByTituloContaining(@Param("titulo") String titulo);

    /**
     * Busca todos os artigos ordenados por data de criação ascendente.
     *
     * @return Lista de artigos ordenados por data de criação ascendente.
     */
    @Query("SELECT a FROM ArtigoModel a ORDER BY a.dataCriacao ASC")
    List<ArtigoModel> findAllOrderByDataCriacaoAsc();

    /**
     * Busca todos os artigos ordenados por data de criação descendente.
     *
     * @return Lista de artigos ordenados por data de criação descendente.
     */
    @Query("SELECT a FROM ArtigoModel a ORDER BY a.dataCriacao DESC")
    List<ArtigoModel> findAllOrderByDataCriacaoDesc();
}