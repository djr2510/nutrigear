package br.com.cesrc.seusuas.controller.artigo.request;

import br.com.cesrc.seusuas.model.artigo.ArtigoModel;
import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * Classe de requisição para criar ou atualizar um artigo.
 *
 * Esta classe define os dados necessários para criar ou atualizar um artigo,
 * incluindo autor, título, texto, descrição, observações, data de criação e imagem.
 */
@Builder
@Data
public class ArtigoRequest {

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
     * Converte o objeto ArtigoRequest para um objeto ArtigoModel.
     *
     * @return Um objeto ArtigoModel com os dados da requisição.
     */
    public ArtigoModel toModel() {
        return ArtigoModel.builder()
                .id(id)
                .criador(criador)
                .titulo(titulo)
                .texto(texto)
                .descricao(descricao)
                .observacoes(observacoes)
                .dataCriacao(dataCriacao)
                .imagem(imagem)
                .build();
    }
}