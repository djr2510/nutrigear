package br.com.cesrc.seusuas.controller.artigo.response;

import br.com.cesrc.seusuas.model.artigo.ArtigoModel;
import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * Classe de resposta para artigos.
 *
 * Esta classe define os dados que serão retornados ao cliente após a criação
 * ou atualização de um artigo, incluindo ID, autor, título, texto, descrição,
 * observações, data de criação e imagem.
 */
@Data
@Builder
public class ArtigoResponse {

    /**
     * Identificador único do artigo.
     */
    private Long id;

    /**
     * Autor do artigo.
     */
    private PessoaModel criador;

    /**
     * Título do artigo.
     */
    private String titulo;

    /**
     * Texto completo do artigo.
     */
    private String texto;

    /**
     * Descrição do artigo.
     */
    private String descricao;

    /**
     * Observações adicionais sobre o artigo.
     */
    private String observacoes;

    /**
     * Data de criação do artigo.
     */
    private Date dataCriacao;

    /**
     * URL da imagem do artigo.
     */
    private String imagem;

    /**
     * Converte um objeto ArtigoModel para um objeto ArtigoResponse.
     *
     * @param artigoModel Objeto ArtigoModel a ser convertido.
     * @return Um objeto ArtigoResponse com os dados do artigo.
     */
    public static ArtigoResponse of(ArtigoModel artigoModel) {
        return ArtigoResponse.builder()
                .id(artigoModel.getId())
                .criador(artigoModel.getCriador())
                .titulo(artigoModel.getTitulo())
                .texto(artigoModel.getTexto())
                .descricao(artigoModel.getDescricao())
                .observacoes(artigoModel.getObservacoes())
                .dataCriacao(artigoModel.getDataCriacao())
                .imagem(artigoModel.getImagem())
                .build();
    }
}