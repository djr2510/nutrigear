package br.com.cesrc.seusuas.controller.receita.request;

import br.com.cesrc.seusuas.model.receita.ReceitaModel;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * Classe de requisição para criar ou atualizar uma receita.
 *
 * Esta classe define os dados necessários para criar ou atualizar uma receita,
 * incluindo título, texto, descrição, observações, data de criação e imagem.
 */
@Builder
@Data
public class ReceitaRequest {

    /**
     * Identificador único da receita.
     */
    private Long id;

    /**
     * Título da receita.
     */
    private String titulo;

    /**
     * Texto detalhado da receita.
     */
    private String texto;

    /**
     * Descrição da receita.
     */
    private String descricao;

    /**
     * Observações adicionais sobre a receita.
     */
    private String observacoes;

    /**
     * Data de criação da receita.
     */
    private Date dataCriacao;

    /**
     * URL da imagem da receita.
     */
    private String imagem;

    /**
     * Converte o objeto ReceitaRequest para um objeto ReceitaModel.
     *
     * @return Um objeto ReceitaModel com os dados da requisição.
     */
    public ReceitaModel toModel() {
        return ReceitaModel.builder()
                .id(id)
                .titulo(titulo)
                .texto(texto)
                .descricao(descricao)
                .observacoes(observacoes)
                .dataCriacao(dataCriacao)
                .imagem(imagem)
                .build();
    }
}