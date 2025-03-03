package br.com.cesrc.seusuas.controller.comentario;

import br.com.cesrc.seusuas.model.comentario.ComentarioModel;
import br.com.cesrc.seusuas.service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {

    private final ComentarioService comentarioService;

    @Autowired
    public ComentarioController(ComentarioService comentarioService) {
        this.comentarioService = comentarioService;
    }

    @PostMapping
    public ResponseEntity<ComentarioModel> salvarComentario(@RequestBody ComentarioModel comentario) {
        ComentarioModel comentarioSalvo = comentarioService.salvarComentario(comentario);
        return new ResponseEntity<>(comentarioSalvo, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarComentario(@PathVariable Long id) {
        try {
            comentarioService.deletarComentario(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<ComentarioModel>> listarComentarios() {
        List<ComentarioModel> comentarios = comentarioService.listarComentario();
        return new ResponseEntity<>(comentarios, HttpStatus.OK);

    }
}