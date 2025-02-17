package br.com.cesrc.seusuas.controller.artigo.request;


import br.com.cesrc.seusuas.model.artigo.ArtigoModel;
import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class ArtigoRequest {
    private Long id;
    private PessoaModel criador;
    private String titulo;
    private String texto;
    private String descricao;
    private String observacoes;
    private Date dataCriacao;
    private String imagem;
    public ArtigoModel toModel(){
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
