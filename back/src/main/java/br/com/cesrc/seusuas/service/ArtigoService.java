package br.com.cesrc.seusuas.service;

import br.com.cesrc.seusuas.model.artigo.ArtigoModel;
import br.com.cesrc.seusuas.repository.ArtigoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Serviço responsável por fornecer operações de negócio relacionadas a artigos.
 * Este serviço atua como uma camada intermediária entre o controlador e o repositório,
 * encapsulando a lógica de negócios e fornecendo métodos para manipulação de dados de artigos.
 */
@Service
public class ArtigoService {

    private final ArtigoRepository artigoRepository;

    /**
     * Construtor da classe ArtigoService.
     *
     * @param artigoRepository Repositório de artigos injetado via Spring Dependency Injection.
     */
    public ArtigoService(ArtigoRepository artigoRepository) {
        this.artigoRepository = artigoRepository;
    }

    /**
     * Salva um novo artigo ou atualiza um artigo existente.
     *
     * @param artigo Modelo do artigo a ser salvo ou atualizado.
     * @return O artigo salvo ou atualizado.
     */
    public ArtigoModel salvarArtigo(ArtigoModel artigo) {
        return artigoRepository.save(artigo);
    }

    /**
     * Deleta um artigo pelo ID.
     *
     * @param id ID do artigo a ser deletado.
     */
    public void deletarArtigo(Long id) {
        artigoRepository.deleteById(id);
    }

    /**
     * Busca artigos por título, contendo a string fornecida.
     *
     * @param titulo String a ser buscada no título do artigo.
     * @return Lista de artigos que contêm a string fornecida no título.
     */
    public List<ArtigoModel> procurarPorTitulo(String titulo) {
        return artigoRepository.findByTituloContaining(titulo);
    }

    /**
     * Lista todos os artigos.
     *
     * @return Lista de todos os artigos.
     */
    public List<ArtigoModel> listarArtigos() {
        return artigoRepository.findAll();
    }

    /**
     * Lista todos os artigos ordenados por data de criação descendente.
     *
     * @return Lista de artigos ordenados por data de criação descendente.
     */
    public List<ArtigoModel> listarArtigosPorDataCriacaoDesc() {
        return artigoRepository.findAllOrderByDataCriacaoDesc();
    }

    /**
     * Lista todos os artigos ordenados por data de criação ascendente.
     *
     * @return Lista de artigos ordenados por data de criação ascendente.
     */
    public List<ArtigoModel> listarArtigosPorDataCriacaoAsc() {
        return artigoRepository.findAllOrderByDataCriacaoAsc();
    }
}