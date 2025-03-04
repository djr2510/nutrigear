package br.com.cesrc.seusuas.controller.comentario.request;

import br.com.cesrc.seusuas.model.comentario.ComentarioModel;
import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * Classe de requisição para criar ou atualizar um comentário.
 *
 * Esta classe define os dados necessários para criar ou atualizar um comentário,
 * incluindo autor, texto do comentário e data de criação.
 */
@Builder
@Data
public class ComentarioRequest {

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
     * Converte o objeto ComentarioRequest para um objeto ComentarioModel.
     *
     * @return Um objeto ComentarioModel com os dados da requisição.
     */
    public ComentarioModel toModel() {
        return ComentarioModel.builder()
                .id(id)
                .criador(criador)
                .comentario(comentario)
                .dataCriacao(dataCriacao)
                .build();
    }
}