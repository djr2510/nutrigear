package br.com.cesrc.seusuas.controller.pessoa.request;

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
 * Classe de requisição para criar ou atualizar uma pessoa.
 *
 * Esta classe define os dados necessários para criar ou atualizar uma pessoa,
 * incluindo dados pessoais, restrições e opções alimentares, comentários e artigos.
 */
@Builder
@Data
public class PessoaRequest {

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
     * Converte o objeto PessoaRequest para um objeto PessoaModel.
     *
     * @return Um objeto PessoaModel com os dados da requisição.
     */
    public PessoaModel toModel() {
        return PessoaModel.builder()
                .id(id)
                .nome(nome)
                .email(email)
                .dataNascimento(dataNascimento)
                .senha(senha)
                .restricoesAlimentarList(restricoesAlimentarList)
                .opcaoAlimentarList(opcaoAlimentarList)
                .comentarios(comentarios)
                .artigos(artigos)
                .build();
    }
}