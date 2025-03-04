package br.com.cesrc.seusuas.service;

import br.com.cesrc.seusuas.model.comentario.ComentarioModel;
import br.com.cesrc.seusuas.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Serviço responsável por fornecer operações de negócio relacionadas a comentários.
 * Este serviço atua como uma camada intermediária entre o controlador e o repositório,
 * encapsulando a lógica de negócios e fornecendo métodos para manipulação de dados de comentários.
 */
@Service
public class ComentarioService {

    private final ComentarioRepository comentarioRepository;

    /**
     * Construtor da classe ComentarioService.
     *
     * @param comentarioRepository Repositório de comentários injetado via Spring Dependency Injection.
     */
    @Autowired
    public ComentarioService(ComentarioRepository comentarioRepository) {
        this.comentarioRepository = comentarioRepository;
    }

    /**
     * Salva um novo comentário ou atualiza um comentário existente.
     *
     * @param comentario Modelo do comentário a ser salvo ou atualizado.
     * @return O comentário salvo ou atualizado.
     */
    @Transactional
    public ComentarioModel salvarComentario(ComentarioModel comentario) {
        return comentarioRepository.save(comentario);
    }

    /**
     * Deleta um comentário pelo ID.
     *
     * @param id ID do comentário a ser deletado.
     * @throws RuntimeException Se o comentário com o ID fornecido não for encontrado.
     */
    @Transactional
    public void deletarComentario(Long id) {
        Optional<ComentarioModel> comentario = comentarioRepository.findById(id);
        if (comentario.isPresent()) {
            comentarioRepository.deleteById(id);
        } else {
            throw new RuntimeException("Comentário não encontrado com ID: " + id);
        }
    }

    /**
     * Lista todos os comentários.
     *
     * @return Lista de todos os comentários.
     */
    public List<ComentarioModel> listarComentario() {
        return comentarioRepository.findAll();
    }
}