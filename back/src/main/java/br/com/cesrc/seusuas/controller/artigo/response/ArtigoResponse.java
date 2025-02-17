package br.com.cesrc.seusuas.controller.artigo.response;

import br.com.cesrc.seusuas.controller.alimento.response.AlimentoResponse;
import br.com.cesrc.seusuas.model.alimento.AlimentoModel;
import br.com.cesrc.seusuas.model.artigo.ArtigoModel;
import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import lombok.Builder;
import lombok.Data;
import java.util.Date;

@Data
@Builder
public class ArtigoResponse {

    private Long id;
    private PessoaModel criador;
    private String titulo;
    private String texto;
    private String descricao;
    private String observacoes;
    private Date dataCriacao;
    private String imagem;

    public static br.com.cesrc.seusuas.controller.artigo.response.ArtigoResponse of(ArtigoModel artigoModel){
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
