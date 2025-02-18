package br.com.cesrc.seusuas.controller.receita.request;


import br.com.cesrc.seusuas.model.artigo.ArtigoModel;
import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import br.com.cesrc.seusuas.model.receita.ReceitaModel;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class ReceitaRequest {
    private Long id;
    private String titulo;
    private String texto;
    private String descricao;
    private String observacoes;
    private Date dataCriacao;
    private String imagem;
    public ReceitaModel toModel(){
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
