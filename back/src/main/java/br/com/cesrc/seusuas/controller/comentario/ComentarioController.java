package br.com.cesrc.seusuas.controller.comentario;

import br.com.cesrc.seusuas.model.comentario.ComentarioModel;
import br.com.cesrc.seusuas.service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para operações relacionadas a comentários.
 *
 * Este controlador fornece endpoints para criar, deletar e listar comentários.
 */
@RestController
@RequestMapping("/comentarios")
public class ComentarioController {

    private final ComentarioService comentarioService;

    /**
     * Construtor da classe ComentarioController.
     *
     * @param comentarioService Serviço de comentários injetado via Spring Dependency Injection.
     */
    @Autowired
    public ComentarioController(ComentarioService comentarioService) {
        this.comentarioService = comentarioService;
    }

    /**
     * Cria um novo comentário.
     *
     * @param comentario Modelo do comentário a ser criado.
     * @return ResponseEntity contendo o comentário criado e o status HTTP 201 (CREATED).
     */
    @PostMapping
    public ResponseEntity<ComentarioModel> salvarComentario(@RequestBody ComentarioModel comentario) {
        ComentarioModel comentarioSalvo = comentarioService.salvarComentario(comentario);
        return new ResponseEntity<>(comentarioSalvo, HttpStatus.CREATED);
    }

    /**
     * Deleta um comentário pelo ID.
     *
     * @param id ID do comentário a ser deletado.
     * @return ResponseEntity com status HTTP 204 (NO_CONTENT) se o comentário for deletado com sucesso,
     * ou status HTTP 404 (NOT_FOUND) se o comentário não for encontrado.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarComentario(@PathVariable Long id) {
        try {
            comentarioService.deletarComentario(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Lista todos os comentários.
     *
     * @return ResponseEntity contendo a lista de comentários e o status HTTP 200 (OK).
     */
    @GetMapping
    public ResponseEntity<List<ComentarioModel>> listarComentarios() {
        List<ComentarioModel> comentarios = comentarioService.listarComentario();
        return new ResponseEntity<>(comentarios, HttpStatus.OK);
    }
}