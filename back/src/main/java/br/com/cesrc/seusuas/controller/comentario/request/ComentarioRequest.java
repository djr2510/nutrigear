package br.com.cesrc.seusuas.controller.comentario.request;

import br.com.cesrc.seusuas.model.artigo.ArtigoModel;
import br.com.cesrc.seusuas.model.comentario.ComentarioModel;
import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class ComentarioRequest {
    private Long id;
    private PessoaModel criador;
    private String comentario;
    private Date dataCriacao;
    public ComentarioModel toModel(){
        return ComentarioModel.builder()
                .id(id)
                .criador(criador)
                .comentario(comentario)
                .dataCriacao(dataCriacao)
                .build();
    }
}
