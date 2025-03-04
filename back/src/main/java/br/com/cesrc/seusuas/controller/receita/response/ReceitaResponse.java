package br.com.cesrc.seusuas.controller.receita.response;

import br.com.cesrc.seusuas.model.receita.ReceitaModel;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * Classe de resposta para receitas.
 *
 * Esta classe define os dados que serão retornados ao cliente após a criação
 * ou atualização de uma receita, incluindo ID, título, texto, descrição,
 * observações, data de criação e imagem.
 */
@Data
@Builder
public class ReceitaResponse {

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
     * Converte um objeto ReceitaModel para um objeto ReceitaResponse.
     *
     * @param receitaModel Objeto ReceitaModel a ser convertido.
     * @return Um objeto ReceitaResponse com os dados da receita.
     */
    public static ReceitaResponse of(ReceitaModel receitaModel) {
        return ReceitaResponse.builder()
                .id(receitaModel.getId())
                .titulo(receitaModel.getTitulo())
                .texto(receitaModel.getTexto())
                .descricao(receitaModel.getDescricao())
                .observacoes(receitaModel.getObservacoes())
                .dataCriacao(receitaModel.getDataCriacao())
                .imagem(receitaModel.getImagem())
                .build();
    }
}