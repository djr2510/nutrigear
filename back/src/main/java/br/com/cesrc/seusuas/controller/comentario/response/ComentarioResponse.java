package br.com.cesrc.seusuas.controller.comentario.response;

import br.com.cesrc.seusuas.controller.artigo.response.ArtigoResponse;
import br.com.cesrc.seusuas.model.artigo.ArtigoModel;
import br.com.cesrc.seusuas.model.comentario.ComentarioModel;
import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class ComentarioResponse {
    private Long id;
    private PessoaModel criador;
    private String comentario;
    private Date dataCriacao;
    public static br.com.cesrc.seusuas.controller.comentario.response.ComentarioResponse of(ComentarioModel comentarioModel){
        return ComentarioResponse.builder()
                .id(comentarioModel.getId())
                .criador(comentarioModel.getCriador())
                .comentario(comentarioModel.getComentario())
                .dataCriacao(comentarioModel.getDataCriacao())
                .build();
    }
}
