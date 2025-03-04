package br.com.cesrc.seusuas.controller.comentario.response;

import br.com.cesrc.seusuas.model.comentario.ComentarioModel;
import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * Classe de resposta para comentários.
 *
 * Esta classe define os dados que serão retornados ao cliente após a criação
 * ou atualização de um comentário, incluindo ID, autor, texto do comentário e data de criação.
 */
@Data
@Builder
public class ComentarioResponse {

    /**
     * Identificador único do comentário.
     */
    private Long id;

    /**
     * Autor do comentário.
     */
    private PessoaModel criador;

    /**
     * Texto do comentário.
     */
    private String comentario;

    /**
     * Data de criação do comentário.
     */
    private Date dataCriacao;

    /**
     * Converte um objeto ComentarioModel para um objeto ComentarioResponse.
     *
     * @param comentarioModel Objeto ComentarioModel a ser convertido.
     * @return Um objeto ComentarioResponse com os dados do comentário.
     */
    public static ComentarioResponse of(ComentarioModel comentarioModel) {
        return ComentarioResponse.builder()
                .id(comentarioModel.getId())
                .criador(comentarioModel.getCriador())
                .comentario(comentarioModel.getComentario())
                .dataCriacao(comentarioModel.getDataCriacao())
                .build();
    }
}