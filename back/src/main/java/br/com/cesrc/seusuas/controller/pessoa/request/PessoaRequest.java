package br.com.cesrc.seusuas.controller.pessoa.request;

import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Builder
@Data
public class PessoaRequest {
    private Long id;
    private String nome;
    private Date dataNascimento;
    private List<DocumentoRequest> documentos;

    public PessoaModel toModel(){
        return PessoaModel.builder()
                .id(id)
                .nome(nome)
                .dataNascimento(dataNascimento)
                .build();
    }
}
