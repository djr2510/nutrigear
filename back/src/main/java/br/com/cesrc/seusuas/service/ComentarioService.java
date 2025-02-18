package br.com.cesrc.seusuas.service;

import br.com.cesrc.seusuas.model.comentario.ComentarioModel;
import br.com.cesrc.seusuas.repository.ComentarioRepository;

import java.util.List;

public class ComentarioService {

    private final ComentarioRepository comentarioRepository;

    public ComentarioService(ComentarioRepository comentarioRepository) {this.comentarioRepository = comentarioRepository;}
    //Salvar Comentario
    public ComentarioModel salvarComentario(ComentarioModel comentario) {return comentarioRepository.save(comentario);}
    //Deletar Comentario
    public void deletarComentario(Long id) {
        comentarioRepository.deleteById(id);
    }


    public List<ComentarioModel> listarComentario() {
        return comentarioRepository.findAll();
    }
}

