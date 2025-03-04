package br.com.cesrc.seusuas.service;

import br.com.cesrc.seusuas.model.alimento.AlimentoModel;
import br.com.cesrc.seusuas.model.alimento.TipoAlimento;
import br.com.cesrc.seusuas.repository.AlimentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Serviço responsável por fornecer operações de negócio relacionadas a alimentos.
 * Este serviço atua como uma camada intermediária entre o controlador e o repositório,
 * encapsulando a lógica de negócios e fornecendo métodos para manipulação de dados de alimentos.
 */
@Service
public class AlimentoService {

    private final AlimentoRepository alimentoRepository;

    /**
     * Construtor da classe AlimentoService.
     *
     * @param alimentoRepository Repositório de alimentos injetado via Spring Dependency Injection.
     */
    public AlimentoService(AlimentoRepository alimentoRepository) {
        this.alimentoRepository = alimentoRepository;
    }

    /**
     * Salva um novo alimento ou atualiza um alimento existente.
     *
     * @param alimento Modelo do alimento a ser salvo ou atualizado.
     * @return O alimento salvo ou atualizado.
     */
    public AlimentoModel salvarAlimento(AlimentoModel alimento) {
        return alimentoRepository.save(alimento);
    }

    /**
     * Deleta um alimento pelo ID.
     *
     * @param id ID do alimento a ser deletado.
     */
    public void deletarAlimento(Long id) {
        alimentoRepository.deleteById(id);
    }

    /**
     * Lista todos os alimentos.
     *
     * @return Lista de todos os alimentos.
     */
    public List<AlimentoModel> listarAlimento() {
        return alimentoRepository.findAll();
    }

    /**
     * Busca alimentos por nome, contendo a string fornecida.
     *
     * @param nome String a ser buscada no nome do alimento.
     * @return Lista de alimentos que contêm a string fornecida no nome.
     */
    public List<AlimentoModel> listarAlimentoPorNome(String nome) {
        return alimentoRepository.findByNomeContaining(nome);
    }

    /**
     * Busca alimentos por quantidade aproximada de vitamina A (variação de 10%).
     *
     * @param quantidade Quantidade de vitamina A a ser buscada.
     * @return Lista de alimentos com quantidade aproximada de vitamina A.
     */
    public List<AlimentoModel> listarAlimentosPorVitaminaA(Double quantidade) {
        return alimentoRepository.findByVitaminaA(quantidade);
    }

    /**
     * Busca alimentos por quantidade aproximada de vitamina B (variação de 10%).
     *
     * @param quantidade Quantidade de vitamina B a ser buscada.
     * @return Lista de alimentos com quantidade aproximada de vitamina B.
     */
    public List<AlimentoModel> listarAlimentosPorVitaminaB(Double quantidade) {
        return alimentoRepository.findByVitaminaB(quantidade);
    }

    /**
     * Busca alimentos por quantidade aproximada de vitamina C (variação de 10%).
     *
     * @param quantidade Quantidade de vitamina C a ser buscada.
     * @return Lista de alimentos com quantidade aproximada de vitamina C.
     */
    public List<AlimentoModel> listarAlimentosPorVitaminaC(Double quantidade) {
        return alimentoRepository.findByVitaminaC(quantidade);
    }

    /**
     * Busca alimentos por quantidade aproximada de vitamina D (variação de 10%).
     *
     * @param quantidade Quantidade de vitamina D a ser buscada.
     * @return Lista de alimentos com quantidade aproximada de vitamina D.
     */
    public List<AlimentoModel> listarAlimentosPorVitaminaD(Double quantidade) {
        return alimentoRepository.findByVitaminaD(quantidade);
    }

    /**
     * Busca alimentos por quantidade aproximada de vitamina E (variação de 10%).
     *
     * @param quantidade Quantidade de vitamina E a ser buscada.
     * @return Lista de alimentos com quantidade aproximada de vitamina E.
     */
    public List<AlimentoModel> listarAlimentosPorVitaminaE(Double quantidade) {
        return alimentoRepository.findByVitaminaE(quantidade);
    }

    /**
     * Busca alimentos por quantidade aproximada de vitamina K (variação de 10%).
     *
     * @param quantidade Quantidade de vitamina K a ser buscada.
     * @return Lista de alimentos com quantidade aproximada de vitamina K.
     */
    public List<AlimentoModel> listarAlimentosPorVitaminaK(Double quantidade) {
        return alimentoRepository.findByVitaminaK(quantidade);
    }

    /**
     * Busca alimentos por tipo.
     *
     * @param tipoAlimento Tipo de alimento a ser buscado.
     * @return Lista de alimentos do tipo fornecido.
     */
    public List<AlimentoModel> listarAlimentosPorTipo(TipoAlimento tipoAlimento) {
        return alimentoRepository.findByTipo(tipoAlimento);
    }

    /**
     * Lista todos os alimentos ordenados por quantidade de proteínas decrescente.
     *
     * @return Lista de alimentos ordenados por proteínas decrescente.
     */
    public List<AlimentoModel> listarAlimentosPorProteinasDesc() {
        return alimentoRepository.findAllOrderByProteinasDesc();
    }

    /**
     * Lista todos os alimentos ordenados por quantidade de vitamina A decrescente.
     *
     * @return Lista de alimentos ordenados por vitamina A decrescente.
     */
    public List<AlimentoModel> listarAlimentosPorVitaminaADesc() {
        return alimentoRepository.findAllOrderByVitaminaADesc();
    }

    /**
     * Lista todos os alimentos ordenados por quantidade de vitamina B decrescente.
     *
     * @return Lista de alimentos ordenados por vitamina B decrescente.
     */
    public List<AlimentoModel> listarAlimentosPorVitaminaBDesc() {
        return alimentoRepository.findAllOrderByVitaminaBDesc();
    }

    /**
     * Lista todos os alimentos ordenados por quantidade de vitamina C decrescente.
     *
     * @return Lista de alimentos ordenados por vitamina C decrescente.
     */
    public List<AlimentoModel> listarAlimentosPorVitaminaCDesc() {
        return alimentoRepository.findAllOrderByVitaminaCDesc();
    }

    /**
     * Lista todos os alimentos ordenados por quantidade de vitamina D decrescente.
     *
     * @return Lista de alimentos ordenados por vitamina D decrescente.
     */
    public List<AlimentoModel> listarAlimentosPorVitaminaDDesc() {
        return alimentoRepository.findAllOrderByVitaminaDDesc();
    }

    /**
     * Lista todos os alimentos ordenados por quantidade de vitamina E decrescente.
     *
     * @return Lista de alimentos ordenados por vitamina E decrescente.
     */
    public List<AlimentoModel> listarAlimentosPorVitaminaEDesc() {
        return alimentoRepository.findAllOrderByVitaminaEDesc();
    }

    /**
     * Lista todos os alimentos ordenados por quantidade de vitamina K decrescente.
     *
     * @return Lista de alimentos ordenados por vitamina K decrescente.
     */
    public List<AlimentoModel> listarAlimentosPorVitaminaKDesc() {
        return alimentoRepository.findAllOrderByVitaminaKDesc();
    }

    /**
     * Lista todos os alimentos ordenados por quantidade de proteínas crescente.
     *
     * @return Lista de alimentos ordenados por proteínas crescente.
     */
    public List<AlimentoModel> listarAlimentosPorProteinasAsc() {
        return alimentoRepository.findAllOrderByProteinasAsc();
    }

    /**
     * Lista todos os alimentos ordenados por quantidade de vitamina A crescente.
     *
     * @return Lista de alimentos ordenados por vitamina A crescente.
     */
    public List<AlimentoModel> listarAlimentosPorVitaminaAAsc() {
        return alimentoRepository.findAllOrderByVitaminaAAsc();
    }

    /**
     * Lista todos os alimentos ordenados por quantidade de vitamina B crescente.
     *
     * @return Lista de alimentos ordenados por vitamina B crescente.
     */
    public List<AlimentoModel> listarAlimentosPorVitaminaBAsc() {
        return alimentoRepository.findAllOrderByVitaminaBAsc();
    }

    /**
     * Lista todos os alimentos ordenados por quantidade de vitamina C crescente.
     *
     * @return Lista de alimentos ordenados por vitamina C crescente.
     */
    public List<AlimentoModel> listarAlimentosPorVitaminaCAsc() {
        return alimentoRepository.findAllOrderByVitaminaCAsc();
    }
}