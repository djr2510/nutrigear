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

/**
 * Controlador REST para operações relacionadas a alimentos.
 *
 * Este controlador fornece endpoints para listar e buscar alimentos, com opções
 * de filtragem por nome, tipo e vitaminas, além de ordenação por vitaminas e proteínas.
 */
@RequestMapping(path = "/alimentos")
@RestController
public class AlimentoController {

    private final AlimentoRepository alimentoRepository;

    /**
     * Construtor da classe AlimentoController.
     *
     * @param alimentoRepository Repositório de alimentos injetado via Spring Dependency Injection.
     */
    public AlimentoController(AlimentoRepository alimentoRepository) {
        this.alimentoRepository = alimentoRepository;
    }

    /**
     * Lista todos os alimentos.
     *
     * @return ResponseEntity contendo a lista de alimentos e o status HTTP 200 (OK).
     */
    @GetMapping
    public ResponseEntity<List<AlimentoResponse>> listarAlimentos() {
        List<AlimentoModel> alimentos = alimentoRepository.findAll();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    /**
     * Busca alimentos filtrados pelo nome.
     *
     * @param nome Nome do alimento a ser buscado.
     * @return ResponseEntity contendo a lista de alimentos encontrados e o status HTTP 200 (OK).
     */
    @GetMapping("/buscar-por-nome")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorNome(@RequestParam String nome) {
        List<AlimentoModel> alimentos = alimentoRepository.findByNomeContaining(nome);
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    /**
     * Ordena alimentos pela vitamina A (crescente).
     *
     * @return ResponseEntity contendo a lista de alimentos ordenados e o status HTTP 200 (OK).
     */
    @GetMapping("/ordenar-por-vitaminaA-asc")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaAAsc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaAAsc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    /**
     * Ordena alimentos pela vitamina A (decrescente).
     *
     * @return ResponseEntity contendo a lista de alimentos ordenados e o status HTTP 200 (OK).
     */
    @GetMapping("/ordenar-por-vitaminaA-desc")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaADesc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaADesc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    /**
     * Ordena alimentos pela vitamina B (crescente).
     *
     * @return ResponseEntity contendo a lista de alimentos ordenados e o status HTTP 200 (OK).
     */
    @GetMapping("/ordenar-por-vitaminaB-asc")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaBAsc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaBAsc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    /**
     * Ordena alimentos pela vitamina B (decrescente).
     *
     * @return ResponseEntity contendo a lista de alimentos ordenados e o status HTTP 200 (OK).
     */
    @GetMapping("/ordenar-por-vitaminaB-desc")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaBDesc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaBDesc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    /**
     * Ordena alimentos pela vitamina C (crescente).
     *
     * @return ResponseEntity contendo a lista de alimentos ordenados e o status HTTP 200 (OK).
     */
    @GetMapping("/ordenar-por-vitaminaC-asc")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaCAsc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaCAsc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    /**
     * Ordena alimentos pela vitamina C (decrescente).
     *
     * @return ResponseEntity contendo a lista de alimentos ordenados e o status HTTP 200 (OK).
     */
    @GetMapping("/ordenar-por-vitaminaC-desc")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaCDesc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaCDesc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    /**
     * Ordena alimentos pela vitamina D (crescente).
     *
     * @return ResponseEntity contendo a lista de alimentos ordenados e o status HTTP 200 (OK).
     */
    @GetMapping("/ordenar-por-vitaminaD-asc")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaDAsc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaDAsc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    /**
     * Ordena alimentos pela vitamina D (decrescente).
     *
     * @return ResponseEntity contendo a lista de alimentos ordenados e o status HTTP 200 (OK).
     */
    @GetMapping("/ordenar-por-vitaminaD-desc")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaDDesc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaDDesc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    /**
     * Ordena alimentos pela vitamina E (crescente).
     *
     * @return ResponseEntity contendo a lista de alimentos ordenados e o status HTTP 200 (OK).
     */
    @GetMapping("/ordenar-por-vitaminaE-asc")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaEAsc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaEAsc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    /**
     * Ordena alimentos pela vitamina E (decrescente).
     *
     * @return ResponseEntity contendo a lista de alimentos ordenados e o status HTTP 200 (OK).
     */
    @GetMapping("/ordenar-por-vitaminaE-desc")
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorVitaminaEDesc() {
        List<AlimentoModel> alimentos = alimentoRepository.findAllOrderByVitaminaEDesc();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }
    /**
     * Ordena alimentos pelo filtro desejado.
     *
     * @return ResponseEntity contendo a lista de alimentos ordenados e o status HTTP 200 (OK).
     */
    /*
    @GetMapping("/procurar-personalizado")
    public ResponseEntity<List<AlimentoModel>> findByAllFieldsWithVariation(
            @RequestParam(required = false) String nome,
            @RequestParam(required = false) TipoAlimento tipoAlimento,
            @RequestParam(required = false) Integer gramaMin, @RequestParam(required = false) Integer gramaMax,
            @RequestParam(required = false) Integer valorEnergeticoMin, @RequestParam(required = false) Integer valorEnergeticoMax,
            @RequestParam(required = false) Integer carboidratosMin, @RequestParam(required = false) Integer carboidratosMax,
            @RequestParam(required = false) Integer acucaresTotaisMin, @RequestParam(required = false) Integer acucaresTotaisMax,
            @RequestParam(required = false) Integer acucaresAdicionaisMin, @RequestParam(required = false) Integer acucaresAdicionaisMax,
            @RequestParam(required = false) Integer proteinasMin, @RequestParam(required = false) Integer proteinasMax,
            @RequestParam(required = false) Integer gorduraTotaisMin, @RequestParam(required = false) Integer gorduraTotaisMax,
            @RequestParam(required = false) Integer gorduraTransMin, @RequestParam(required = false) Integer gorduraTransMax,
            @RequestParam(required = false) Integer gorduraSaturadaMin, @RequestParam(required = false) Integer gorduraSaturadaMax,
            @RequestParam(required = false) Integer fibraMin, @RequestParam(required = false) Integer fibraMax,
            @RequestParam(required = false) Integer sodioMin, @RequestParam(required = false) Integer sodioMax,
            @RequestParam(required = false) Integer vitaminaAMin, @RequestParam(required = false) Integer vitaminaAMax,
            @RequestParam(required = false) Integer vitaminaBMin, @RequestParam(required = false) Integer vitaminaBMax,
            @RequestParam(required = false) Integer vitaminaCMin, @RequestParam(required = false) Integer vitaminaCMax,
            @RequestParam(required = false) Integer vitaminaDMin, @RequestParam(required = false) Integer vitaminaDMax,
            @RequestParam(required = false) Integer vitaminaEMin, @RequestParam(required = false) Integer vitaminaEMax,
            @RequestParam(required = false) Integer vitaminaKMin, @RequestParam(required = false) Integer vitaminaKMax
    ) {
        List<AlimentoModel> alimentos = alimentoRepository.findByAllFieldsWithVariation(
                nome, tipoAlimento, gramaMin, gramaMax, valorEnergeticoMin, valorEnergeticoMax,
                carboidratosMin, carboidratosMax, acucaresTotaisMin, acucaresTotaisMax, acucaresAdicionaisMin, acucaresAdicionaisMax,
                proteinasMin, proteinasMax, gorduraTotaisMin, gorduraTotaisMax, gorduraTransMin, gorduraTransMax,
                gorduraSaturadaMin, gorduraSaturadaMax, fibraMin, fibraMax, sodioMin, sodioMax,
                vitaminaAMin, vitaminaAMax, vitaminaBMin, vitaminaBMax, vitaminaCMin, vitaminaCMax,
                vitaminaDMin, vitaminaDMax, vitaminaEMin, vitaminaEMax, vitaminaKMin, vitaminaKMax
        );

        if (alimentos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(alimentos);
    }     */
}