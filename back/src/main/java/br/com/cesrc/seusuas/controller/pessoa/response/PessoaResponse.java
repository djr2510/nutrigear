package br.com.cesrc.seusuas.controller.pessoa.response;

import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class PessoaResponse {
    private Long id;
    private String nome;
    private Date dataNascimento;

    public static PessoaResponse of(PessoaModel acolhido){
        return PessoaResponse.builder()
                .id(acolhido.getId())
                .nome(acolhido.getNome())
                .dataNascimento(acolhido.getDataNascimento())
                .build();
    }
}
