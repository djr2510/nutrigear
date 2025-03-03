package br.com.cesrc.seusuas.controller.receita;

import br.com.cesrc.seusuas.model.receita.ReceitaModel;
import br.com.cesrc.seusuas.service.ReceitaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/receitas")
public class ReceitaController {

    private final ReceitaService receitaService;

    public ReceitaController(ReceitaService receitaService) {
        this.receitaService = receitaService;
    }

    @PostMapping
    public ResponseEntity<ReceitaModel> salvarReceita(@RequestBody ReceitaModel receita) {
        ReceitaModel savedReceita = receitaService.salvarReceita(receita);
        return new ResponseEntity<>(savedReceita, HttpStatus.CREATED);
    }

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

    @GetMapping("/{id}")
    public ResponseEntity<ReceitaModel> buscarReceitaPorId(@PathVariable Long id) {
        Optional<ReceitaModel> receita = receitaService.buscarPorId(id);
        return receita.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body(null));
    }

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
