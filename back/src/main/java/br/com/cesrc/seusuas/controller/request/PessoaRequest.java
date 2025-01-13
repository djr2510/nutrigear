package br.com.cesrc.seusuas.controller.request;

import br.com.cesrc.seusuas.model.PessoaModel;
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
