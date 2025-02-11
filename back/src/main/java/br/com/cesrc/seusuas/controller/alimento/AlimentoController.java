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

@RequestMapping(path = "/alimentos")
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

    // Ordena alimentos pela vitamina A (crescente)
    @GetMapping("/ordenar-por-vitaminaA-asc")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaAAsc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaAAsc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Ordena alimentos pela vitamina A (decrescente)
    @GetMapping("/ordenar-por-vitaminaA-desc")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaADesc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaADesc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Ordena alimentos pela vitamina B (crescente)
    @GetMapping("/ordenar-por-vitaminaB-asc")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaBAsc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaBAsc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Ordena alimentos pela vitamina B (decrescente)
    @GetMapping("/ordenar-por-vitaminaB-desc")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaBDesc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaBDesc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Ordena alimentos pela vitamina C (crescente)
    @GetMapping("/ordenar-por-vitaminaC-asc")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaCAsc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaCAsc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Ordena alimentos pela vitamina C (decrescente)
    @GetMapping("/ordenar-por-vitaminaC-desc")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaCDesc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaCDesc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Ordena alimentos pela vitamina D (crescente)
    @GetMapping("/ordenar-por-vitaminaD-asc")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaDAsc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaDAsc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Ordena alimentos pela vitamina D (decrescente)
    @GetMapping("/ordenar-por-vitaminaD-desc")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaDDesc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaDDesc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Ordena alimentos pela vitamina E (crescente)
    @GetMapping("/ordenar-por-vitaminaE-asc")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaEAsc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaEAsc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Ordena alimentos pela vitamina E (decrescente)
    @GetMapping("/ordenar-por-vitaminaE-desc")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaEDesc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaEDesc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Ordena alimentos pela vitamina K (crescente)
    @GetMapping("/ordenar-por-vitaminaK-asc")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaKAsc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaKAsc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Ordena alimentos pela vitamina K (decrescente)
    @GetMapping("/ordenar-por-vitaminaK-desc")
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
    @GetMapping("/ordenar-por-proteinas-desc")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorProteinasDesc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByProteinasDesc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Ordena alimentos pela quantidade de proteínas (crescente)
    @GetMapping("/ordenar-por-proteinas-asc")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorProteinasAsc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByProteinasAsc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Busca aproximada por vitamina A
    @GetMapping("/buscar-por-vitaminaA")
    public ResponseEntity<List<AlimentoResponse>> buscarAlimentosPorVitaminaA(@RequestParam Double quantidade) {
        List<AlimentoModel> alimentos = alimentoRepository.findByVitaminaA(quantidade);
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Busca aproximada por vitamina B
    @GetMapping("/buscar-por-vitaminaB")
    public ResponseEntity<List<AlimentoResponse>> buscarAlimentosPorVitaminaB(@RequestParam Double quantidade) {
        List<AlimentoModel> alimentos = alimentoRepository.findByVitaminaB(quantidade);
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Busca aproximada por vitamina C
    @GetMapping("/buscar-por-vitaminaC")
    public ResponseEntity<List<AlimentoResponse>> buscarAlimentosPorVitaminaC(@RequestParam Double quantidade) {
        List<AlimentoModel> alimentos = alimentoRepository.findByVitaminaC(quantidade);
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Busca aproximada por vitamina D
    @GetMapping("/buscar-por-vitaminaD")
    public ResponseEntity<List<AlimentoResponse>> buscarAlimentosPorVitaminaD(@RequestParam Double quantidade) {
        List<AlimentoModel> alimentos = alimentoRepository.findByVitaminaD(quantidade);
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Busca aproximada por vitamina E
    @GetMapping("/buscar-por-vitaminaE")
    public ResponseEntity<List<AlimentoResponse>> buscarAlimentosPorVitaminaE(@RequestParam Double quantidade) {
        List<AlimentoModel> alimentos = alimentoRepository.findByVitaminaE(quantidade);
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    // Busca aproximada por vitamina K
    @GetMapping("/buscar-por-vitaminaK")
    public ResponseEntity<List<AlimentoResponse>> buscarAlimentosPorVitaminaK(@RequestParam Double quantidade) {
        List<AlimentoModel> alimentos = alimentoRepository.findByVitaminaK(quantidade);
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }
}
