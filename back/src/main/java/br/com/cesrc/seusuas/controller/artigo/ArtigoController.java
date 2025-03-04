package br.com.cesrc.seusuas.controller.artigo;

import br.com.cesrc.seusuas.model.artigo.ArtigoModel;
import br.com.cesrc.seusuas.service.ArtigoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para operações relacionadas a artigos.
 *
 * Este controlador fornece endpoints para listar, buscar, criar e deletar artigos.
 */
@RequestMapping(path = "/artigos")
@RestController
public class ArtigoController {

    private final ArtigoService artigoService;

    /**
     * Construtor da classe ArtigoController.
     *
     * @param artigoService Serviço de artigos injetado via Spring Dependency Injection.
     */
    public ArtigoController(ArtigoService artigoService) {
        this.artigoService = artigoService;
    }

    /**
     * Lista todos os artigos.
     *
     * @return ResponseEntity contendo a lista de artigos e o status HTTP 200 (OK).
     */
    @GetMapping
    public ResponseEntity<List<ArtigoModel>> listarArtigos() {
        List<ArtigoModel> artigos = artigoService.listarArtigos();
        return ResponseEntity.ok(artigos);
    }

    /**
     * Lista todos os artigos ordenados por data de criação ascendente.
     *
     * @return ResponseEntity contendo a lista de artigos e o status HTTP 200 (OK).
     */
    @GetMapping("/data/asc")
    public ResponseEntity<List<ArtigoModel>> listarArtigosPorDataCriacaoAsc() {
        List<ArtigoModel> artigos = artigoService.listarArtigosPorDataCriacaoAsc();
        return ResponseEntity.ok(artigos);
    }

    /**
     * Lista todos os artigos ordenados por data de criação descendente.
     *
     * @return ResponseEntity contendo a lista de artigos e o status HTTP 200 (OK).
     */
    @GetMapping("/data/desc")
    public ResponseEntity<List<ArtigoModel>> listarArtigosPorDataCriacaoDesc() {
        List<ArtigoModel> artigos = artigoService.listarArtigosPorDataCriacaoDesc();
        return ResponseEntity.ok(artigos);
    }

    /**
     * Busca artigos por título.
     *
     * @param titulo Título do artigo a ser buscado.
     * @return ResponseEntity contendo a lista de artigos encontrados e o status HTTP 200 (OK).
     */
    @GetMapping("/buscar")
    public ResponseEntity<List<ArtigoModel>> procurarPorTitulo(@RequestParam String titulo) {
        List<ArtigoModel> artigos = artigoService.procurarPorTitulo(titulo);
        return ResponseEntity.ok(artigos);
    }

    /**
     * Cria um novo artigo.
     *
     * @param artigo Modelo do artigo a ser criado.
     * @return ResponseEntity contendo o artigo criado e o status HTTP 201 (CREATED).
     */
    @PostMapping
    public ResponseEntity<ArtigoModel> salvarArtigo(@RequestBody ArtigoModel artigo) {
        ArtigoModel artigoSalvo = artigoService.salvarArtigo(artigo);
        return ResponseEntity.status(201).body(artigoSalvo);
    }

    /**
     * Deleta um artigo pelo ID.
     *
     * @param id ID do artigo a ser deletado.
     * @return ResponseEntity com status HTTP 204 (NO_CONTENT) se o artigo for deletado com sucesso.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarArtigo(@PathVariable Long id) {
        artigoService.deletarArtigo(id);
        return ResponseEntity.noContent().build();
    }
}