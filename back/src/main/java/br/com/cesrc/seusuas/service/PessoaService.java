package br.com.cesrc.seusuas.service;

import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import br.com.cesrc.seusuas.repository.PessoaRepository;
import br.com.cesrc.seusuas.controller.pessoa.request.PessoaRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Serviço responsável por fornecer operações de negócio relacionadas a pessoas.
 * Este serviço atua como uma camada intermediária entre o controlador e o repositório,
 * encapsulando a lógica de negócios e fornecendo métodos para manipulação de dados de pessoas.
 */
@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    /**
     * Construtor da classe PessoaService.
     *
     * @param pessoaRepository Repositório de pessoas injetado via Spring Dependency Injection.
     */
    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    /**
     * Salva uma nova pessoa ou atualiza uma pessoa existente.
     *
     * @param pessoa Modelo da pessoa a ser salva ou atualizada.
     * @return A pessoa salva ou atualizada.
     */
    public PessoaModel salvarPessoa(PessoaModel pessoa) {
        return pessoaRepository.save(pessoa);
    }

    /**
     * Deleta uma pessoa pelo ID.
     *
     * @param id ID da pessoa a ser deletada.
     * @throws RuntimeException Se a pessoa com o ID fornecido não for encontrada.
     */
    public void deletarPessoa(Long id) {
        if (!pessoaRepository.existsById(id)) {
            throw new RuntimeException("Pessoa com ID " + id + " não encontrada");
        }
        pessoaRepository.deleteById(id);
    }

    /**
     * Lista todas as pessoas.
     *
     * @return Lista de todas as pessoas.
     */
    public List<PessoaModel> listarPessoa() {
        return pessoaRepository.findAll();
    }

    /**
     * Edita uma pessoa existente com base no ID e nos dados fornecidos.
     *
     * @param id ID da pessoa a ser editada.
     * @param pessoaRequest Objeto contendo os dados atualizados da pessoa.
     * @throws RuntimeException Se a pessoa com o ID fornecido não for encontrada.
     */
    public void editarPessoa(Long id, PessoaRequest pessoaRequest) {
        PessoaModel pessoaExistente = pessoaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pessoa com ID " + id + " não encontrada"));
        pessoaExistente.setNome(pessoaRequest.getNome());
        pessoaExistente.setDataNascimento(pessoaRequest.getDataNascimento());
        pessoaRepository.save(pessoaExistente);
    }
}