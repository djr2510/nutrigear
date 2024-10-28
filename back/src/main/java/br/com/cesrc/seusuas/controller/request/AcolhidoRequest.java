package br.com.cesrc.seusuas.controller.request;

import br.com.cesrc.seusuas.model.Acolhido;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Builder
@Data
public class AcolhidoRequest {
    private Long id;
    private String nome;
    private Date dataNascimento;
    private List<DocumentoRequest> documentos;

    public Acolhido toModel(){
        return Acolhido.builder()
                .id(id)
                .nome(nome)
                .dataNascimento(dataNascimento)
                .build();
    }
}
