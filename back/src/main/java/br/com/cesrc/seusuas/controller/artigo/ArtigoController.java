package br.com.cesrc.seusuas.controller.artigo;

import br.com.cesrc.seusuas.model.artigo.ArtigoModel;
import br.com.cesrc.seusuas.service.ArtigoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/artigos")
@RestController
public class ArtigoController {

    private final ArtigoService artigoService;

    public ArtigoController(ArtigoService artigoService) {
        this.artigoService = artigoService;
    }

    @GetMapping
    public ResponseEntity<List<ArtigoModel>> listarArtigos() {
        List<ArtigoModel> artigos = artigoService.listarArtigos();
        return ResponseEntity.ok(artigos);
    }

    @GetMapping("/data/asc")
    public ResponseEntity<List<ArtigoModel>> listarArtigosPorDataCriacaoAsc() {
        List<ArtigoModel> artigos = artigoService.listarArtigosPorDataCriacaoAsc();
        return ResponseEntity.ok(artigos);
    }

    @GetMapping("/data/desc")
    public ResponseEntity<List<ArtigoModel>> listarArtigosPorDataCriacaoDesc() {
        List<ArtigoModel> artigos = artigoService.listarArtigosPorDataCriacaoDesc();
        return ResponseEntity.ok(artigos);
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<ArtigoModel>> procurarPorTitulo(@RequestParam String titulo) {
        List<ArtigoModel> artigos = artigoService.procurarPorTitulo(titulo);
        return ResponseEntity.ok(artigos);
    }

    @PostMapping
    public ResponseEntity<ArtigoModel> salvarArtigo(@RequestBody ArtigoModel artigo) {
        ArtigoModel artigoSalvo = artigoService.salvarArtigo(artigo);
        return ResponseEntity.status(201).body(artigoSalvo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarArtigo(@PathVariable Long id) {
        artigoService.deletarArtigo(id);
        return ResponseEntity.noContent().build();
    }
}
