package br.com.cesrc.seusuas.controller.receita;

import br.com.cesrc.seusuas.model.receita.ReceitaModel;
import br.com.cesrc.seusuas.service.ReceitaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Controlador REST para operações relacionadas a receitas.
 *
 * Este controlador fornece endpoints para criar, buscar, atualizar e deletar receitas.
 */
@RestController
@RequestMapping("/receitas")
public class ReceitaController {

    private final ReceitaService receitaService;

    /**
     * Construtor da classe ReceitaController.
     *
     * @param receitaService Serviço de receitas injetado via Spring Dependency Injection.
     */
    public ReceitaController(ReceitaService receitaService) {
        this.receitaService = receitaService;
    }

    /**
     * Cria uma nova receita.
     *
     * @param receita Modelo da receita a ser criada.
     * @return ResponseEntity contendo a receita criada e o status HTTP 201 (CREATED).
     */
    @PostMapping
    public ResponseEntity<ReceitaModel> salvarReceita(@RequestBody ReceitaModel receita) {
        ReceitaModel savedReceita = receitaService.salvarReceita(receita);
        return new ResponseEntity<>(savedReceita, HttpStatus.CREATED);
    }

    /**
     * Busca todas as receitas, opcionalmente filtrando por título e ordenando por data de criação.
     *
     * @param titulo Título da receita a ser buscada (opcional).
     * @param ordenar Ordem de ordenação das receitas ("asc" para ascendente, "desc" para descendente, padrão é "desc").
     * @return ResponseEntity contendo a lista de receitas encontradas e o status HTTP 200 (OK).
     */
    @GetMapping
    public ResponseEntity<List<ReceitaModel>> buscarTodasReceitas(
            @RequestParam(value = "titulo", required = false) String titulo,
            @RequestParam(value = "ordenar", defaultValue = "desc") String ordenar) {

        List<ReceitaModel> receitas;

        if (titulo != null && !titulo.isEmpty()) {
            receitas = receitaService.buscarPorTitulo(titulo);
        } else {
            if ("asc".equalsIgnoreCase(ordenar)) {
                receitas = receitaService.buscarTodasOrdenadasPorDataAsc();
            } else {
                receitas = receitaService.buscarTodasOrdenadasPorDataDesc();
            }
        }

        return new ResponseEntity<>(receitas, HttpStatus.OK);
    }

    /**
     * Busca uma receita pelo ID.
     *
     * @param id ID da receita a ser buscada.
     * @return ResponseEntity contendo a receita encontrada e o status HTTP 200 (OK),
     * ou status HTTP 404 (NOT_FOUND) se a receita não for encontrada.
     */
    @GetMapping("/{id}")
    public ResponseEntity<ReceitaModel> buscarReceitaPorId(@PathVariable Long id) {
        Optional<ReceitaModel> receita = receitaService.buscarPorId(id);
        return receita.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body(null));
    }

    /**
     * Atualiza uma receita existente.
     *
     * @param id ID da receita a ser atualizada.
     * @param receita Modelo da receita com os dados atualizados.
     * @return ResponseEntity contendo a receita atualizada e o status HTTP 200 (OK),
     * ou status HTTP 404 (NOT_FOUND) se a receita não for encontrada.
     */
    @PutMapping("/{id}")
    public ResponseEntity<ReceitaModel> atualizarReceita(@PathVariable Long id, @RequestBody ReceitaModel receita) {
        Optional<ReceitaModel> receitaExistente = receitaService.buscarPorId(id);

        if (receitaExistente.isPresent()) {
            receita.setId(id);  // Garantir que o ID é mantido
            ReceitaModel updatedReceita = receitaService.salvarReceita(receita);
            return ResponseEntity.ok(updatedReceita);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    /**
     * Deleta uma receita pelo ID.
     *
     * @param id ID da receita a ser deletada.
     * @return ResponseEntity com status HTTP 204 (NO_CONTENT) se a receita for deletada com sucesso,
     * ou status HTTP 404 (NOT_FOUND) se a receita não for encontrada.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarReceita(@PathVariable Long id) {
        Optional<ReceitaModel> receita = receitaService.buscarPorId(id);

        if (receita.isPresent()) {
            receitaService.salvarReceita(receita.get());  // Lógica de exclusão se necessário
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}