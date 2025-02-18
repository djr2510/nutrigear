package br.com.cesrc.seusuas.controller.receita.response;

import br.com.cesrc.seusuas.model.artigo.ArtigoModel;
import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import br.com.cesrc.seusuas.model.receita.ReceitaModel;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class ReceitaResponse {

    private Long id;
    private String titulo;
    private String texto;
    private String descricao;
    private String observacoes;
    private Date dataCriacao;
    private String imagem;

    public static ReceitaResponse of(ReceitaModel receitaModel){
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
