package br.com.cesrc.seusuas.controller.pessoa;

import br.com.cesrc.seusuas.controller.pessoa.response.PessoaResponse;
import br.com.cesrc.seusuas.controller.pessoa.request.PessoaRequest;
import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import br.com.cesrc.seusuas.repository.PessoaRepository;
import br.com.cesrc.seusuas.service.PessoaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

/**
 * Controlador REST para operações relacionadas a pessoas.
 *
 * Este controlador fornece endpoints para deletar, listar e criar pessoas.
 */
@RequestMapping(path = "/pessoas")
@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class PessoaController {

    private final PessoaService pessoaService;
    private final PessoaRepository pessoaRepository;

    /**
     * Construtor da classe PessoaController.
     *
     * @param pessoaService Serviço de pessoas injetado via Spring Dependency Injection.
     * @param pessoaRepository Repositório de pessoas injetado via Spring Dependency Injection.
     */
    public PessoaController(PessoaService pessoaService, PessoaRepository pessoaRepository) {
        this.pessoaService = pessoaService;
        this.pessoaRepository = pessoaRepository;
    }

    /**
     * Deleta uma pessoa pelo ID.
     *
     * @param id ID da pessoa a ser deletada.
     * @return ResponseEntity com status HTTP 204 (NO_CONTENT) se a pessoa for deletada com sucesso,
     * ou status HTTP 404 (NOT_FOUND) se a pessoa não for encontrada.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPessoa(@PathVariable Long id) {
        try {
            pessoaService.deletarPessoa(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            // TODO: Implementar exceção específica para pessoa não encontrada
            // Criar uma exceção personalizada (ex: PessoaNaoEncontradaException) para retornar um status 404
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    /**
     * Lista todas as pessoas.
     *
     * @param id ID da pessoa (opcional).
     * @return ResponseEntity contendo a lista de pessoas e o status HTTP 200 (OK).
     */
    @GetMapping
    public ResponseEntity<List<PessoaResponse>> listarPessoas(@RequestParam(required = false) Long id) {
        List<PessoaModel> pessoas = pessoaRepository.findAll();
        List<PessoaResponse> responseList = pessoas.stream()
                .map(PessoaResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    /**
     * Cria uma nova pessoa.
     *
     * @param pessoaRequest Modelo da pessoa a ser criada.
     * @return ResponseEntity com status HTTP 201 (CREATED) e a URI da pessoa criada.
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Void> salvarPessoa(@RequestBody PessoaRequest pessoaRequest) {
        PessoaModel pessoa = pessoaRequest.toModel();
        pessoaService.salvarPessoa(pessoa);
        return ResponseEntity.created(URI.create("/pessoas")).build();
    }
}