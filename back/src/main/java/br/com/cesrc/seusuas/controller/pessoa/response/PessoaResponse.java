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

@Data
@Builder
public class PessoaResponse {

    private Long id;
    private String nome;
    private String email;
    private Date dataNascimento;
    private String senha;
    private List<RestricoesAlimentar> restricoesAlimentarList;
    private List<OpcaoAlimentar> opcaoAlimentarList;
    private List<ComentarioModel> comentarios;
    private List<ArtigoModel> artigos;

    public static PessoaResponse of(PessoaModel pessoaModel){
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
