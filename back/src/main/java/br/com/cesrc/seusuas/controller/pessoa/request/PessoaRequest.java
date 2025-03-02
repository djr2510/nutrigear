package br.com.cesrc.seusuas.controller.pessoa.request;

import br.com.cesrc.seusuas.model.artigo.ArtigoModel;
import br.com.cesrc.seusuas.model.comentario.ComentarioModel;
import br.com.cesrc.seusuas.model.pessoa.OpcaoAlimentar;
import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import br.com.cesrc.seusuas.model.pessoa.RestricoesAlimentar;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Builder
@Data
public class PessoaRequest {
    private Long id;
    private String nome;
    private String email;
    private Date dataNascimento;
    private String senha;
    private List<RestricoesAlimentar> restricoesAlimentarList;
    private List<OpcaoAlimentar> opcaoAlimentarList;
    private List<ComentarioModel> comentarios;
    private List<ArtigoModel> artigos;

    public PessoaModel toModel(){
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
