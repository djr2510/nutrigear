package br.com.cesrc.seusuas.service;

import br.com.cesrc.seusuas.model.comentario.ComentarioModel;
import br.com.cesrc.seusuas.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ComentarioService {

    private final ComentarioRepository comentarioRepository;

    @Autowired
    public ComentarioService(ComentarioRepository comentarioRepository) {
        this.comentarioRepository = comentarioRepository;
    }

    @Transactional
    public ComentarioModel salvarComentario(ComentarioModel comentario) {
        return comentarioRepository.save(comentario);
    }

    @Transactional
    public void deletarComentario(Long id) {
        Optional<ComentarioModel> comentario = comentarioRepository.findById(id);
        if (comentario.isPresent()) {
            comentarioRepository.deleteById(id);
        } else {
            throw new RuntimeException("Comentário não encontrado com ID: " + id);
        }
    }

    public List<ComentarioModel> listarComentario() {
        return comentarioRepository.findAll();
    }
}
