package br.com.cesrc.seusuas.service;

import br.com.cesrc.seusuas.model.receita.ReceitaModel;
import br.com.cesrc.seusuas.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Serviço responsável por fornecer operações de negócio relacionadas a receitas.
 * Este serviço atua como uma camada intermediária entre o controlador e o repositório,
 * encapsulando a lógica de negócios e fornecendo métodos para manipulação de dados de receitas.
 */
@Service
public class ReceitaService {

    private final ReceitaRepository receitaRepository;

    /**
     * Construtor da classe ReceitaService.
     *
     * @param receitaRepository Repositório de receitas injetado via Spring Dependency Injection.
     */
    @Autowired
    public ReceitaService(ReceitaRepository receitaRepository) {
        this.receitaRepository = receitaRepository;
    }

    /**
     * Salva uma nova receita ou atualiza uma receita existente.
     *
     * @param receita Modelo da receita a ser salva ou atualizada.
     * @return A receita salva ou atualizada.
     */
    public ReceitaModel salvarReceita(ReceitaModel receita) {
        return receitaRepository.save(receita);
    }

    /**
     * Busca receitas por título, ignorando maiúsculas e minúsculas.
     *
     * @param titulo Título da receita a ser buscada.
     * @return Lista de receitas que correspondem ao título fornecido.
     */
    public List<ReceitaModel> buscarPorTitulo(String titulo) {
        return receitaRepository.findByTituloContainingIgnoreCase(titulo);
    }

    /**
     * Busca todas as receitas ordenadas por data de criação em ordem ascendente.
     *
     * @return Lista de todas as receitas ordenadas por data de criação ascendente.
     */
    public List<ReceitaModel> buscarTodasOrdenadasPorDataAsc() {
        return receitaRepository.findAllByOrderByDataCriacaoAsc();
    }

    /**
     * Busca todas as receitas ordenadas por data de criação em ordem descendente.
     *
     * @return Lista de todas as receitas ordenadas por data de criação descendente.
     */
    public List<ReceitaModel> buscarTodasOrdenadasPorDataDesc() {
        return receitaRepository.findAllByOrderByDataCriacaoDesc();
    }

    /**
     * Busca uma receita por ID.
     *
     * @param id ID da receita a ser buscada.
     * @return Um Optional contendo a receita encontrada, ou um Optional vazio se não encontrada.
     */
    public Optional<ReceitaModel> buscarPorId(Long id) {
        return receitaRepository.findById(id);
    }

    /**
     * Busca receitas por restrição alimentar.
     *
     * @param restricao Restrição alimentar a ser buscada.
     * @return Lista de receitas que correspondem à restrição alimentar fornecida.
     */
    public List<ReceitaModel> buscarPorRestricaoAlimentar(String restricao) {
        return receitaRepository.findByRestricaoAlimentar(restricao);
    }

    /**
     * Busca receitas por opção alimentar.
     *
     * @param opcao Opção alimentar a ser buscada.
     * @return Lista de receitas que correspondem à opção alimentar fornecida.
     */
    public List<ReceitaModel> buscarPorOpcaoAlimentar(String opcao) {
        return receitaRepository.findByOpcaoAlimentar(opcao);
    }

    /**
     * Busca receitas por título ou descrição.
     *
     * @param titulo Título da receita a ser buscada.
     * @param descricao Descrição da receita a ser buscada.
     * @return Lista de receitas que correspondem ao título ou descrição fornecidos.
     */
    public List<ReceitaModel> buscarPorTituloOuDescricao(String titulo, String descricao) {
        return receitaRepository.findByTituloOrDescricao(titulo, descricao);
    }
}