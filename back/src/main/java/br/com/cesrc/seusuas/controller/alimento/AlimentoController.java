package br.com.cesrc.seusuas.controller.alimento;

import br.com.cesrc.seusuas.controller.alimento.response.AlimentoResponse;
import br.com.cesrc.seusuas.model.alimento.AlimentoModel;
import br.com.cesrc.seusuas.model.alimento.TipoAlimento;
import br.com.cesrc.seusuas.repository.AlimentoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path = "/alimento")
@RestController
public class AlimentoController {

    private final AlimentoRepository alimentoRepository;

    public AlimentoController(AlimentoRepository alimentoRepository) {
        this.alimentoRepository = alimentoRepository;
    }

    @GetMapping
    public ResponseEntity<List<AlimentoResponse>> listarAlimentos() {
        List<AlimentoModel> alimentos = alimentoRepository.findAll();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Retorna alimentos filtrados pelo nome
    @GetMapping("/buscar-por-nome")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorNome(@RequestParam String nome) {
        List<AlimentoModel> alimentos = alimentoRepository.findByNomeContaining(nome);
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Ordena alimentos pela vitamina A (decrescente)
    @GetMapping("/ordenar-por-vitaminaA")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaADesc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaADesc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Ordena alimentos pela vitamina B (decrescente)
    @GetMapping("/ordenar-por-vitaminaB")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaBDesc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaBDesc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Ordena alimentos pela vitamina C (decrescente)
    @GetMapping("/ordenar-por-vitaminaC")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaCDesc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaCDesc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Ordena alimentos pela vitamina D (decrescente)
    @GetMapping("/ordenar-por-vitaminaD")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaDDesc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaDDesc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Ordena alimentos pela vitamina E (decrescente)
    @GetMapping("/ordenar-por-vitaminaE")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaEDesc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaEDesc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Ordena alimentos pela vitamina K (decrescente)
    @GetMapping("/ordenar-por-vitaminaK")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaKDesc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaKDesc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Retorna alimentos de um tipo específico
    @GetMapping("/buscar-por-tipo")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorTipo(@RequestParam TipoAlimento tipoAlimento) {
        List<AlimentoModel> alimentos = alimentoRepository.findByTipo(tipoAlimento);
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Ordena alimentos pela quantidade de proteínas (decrescente)
    @GetMapping("/ordenar-por-proteinas")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorProteinasDesc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByProteinasDesc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }
}
