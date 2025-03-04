package br.com.cesrc.seusuas.controller.pessoa.response;

import br.com.cesrc.seusuas.model.artigo.ArtigoModel;
import br.com.cesrc.seusuas.model.comentario.ComentarioModel;
import br.com.cesrc.seusuas.model.tags.OpcaoAlimentar;
import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import br.com.cesrc.seusuas.model.tags.RestricoesAlimentar;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Classe de resposta para pessoas.
 *
 * Esta classe define os dados que serão retornados ao cliente após a criação
 * ou atualização de uma pessoa, incluindo dados pessoais, restrições e opções
 * alimentares, comentários e artigos.
 */
@Data
@Builder
public class PessoaResponse {

    /**
     * Identificador único da pessoa.
     */
    private Long id;

    /**
     * Nome da pessoa.
     */
    private String nome;

    /**
     * Endereço de e-mail da pessoa.
     */
    private String email;

    /**
     * Data de nascimento da pessoa.
     */
    private Date dataNascimento;

    /**
     * Senha da pessoa.
     */
    private String senha;

    /**
     * Lista de restrições alimentares da pessoa.
     */
    private List<RestricoesAlimentar> restricoesAlimentarList;

    /**
     * Lista de opções alimentares da pessoa.
     */
    private List<OpcaoAlimentar> opcaoAlimentarList;

    /**
     * Lista de comentários da pessoa.
     */
    private List<ComentarioModel> comentarios;

    /**
     * Lista de artigos da pessoa.
     */
    private List<ArtigoModel> artigos;

    /**
     * Converte um objeto PessoaModel para um objeto PessoaResponse.
     *
     * @param pessoaModel Objeto PessoaModel a ser convertido.
     * @return Um objeto PessoaResponse com os dados da pessoa.
     */
    public static PessoaResponse of(PessoaModel pessoaModel) {
        return PessoaResponse.builder()
                .id(pessoaModel.getId())
                .nome(pessoaModel.getNome())
                .email(pessoaModel.getEmail())
                .dataNascimento(pessoaModel.getDataNascimento())
                .senha(pessoaModel.getSenha())
                .restricoesAlimentarList(pessoaModel.getRestricoesAlimentarList())
                .opcaoAlimentarList(pessoaModel.getOpcaoAlimentarList())
                .comentarios(pessoaModel.getComentarios())
                .artigos(pessoaModel.getArtigos())
                .build();
    }
}