package br.com.cesrc.seusuas.controller.response;

import br.com.cesrc.seusuas.model.Acolhido;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder
public class AcolhidoResponse {
    private Long id;
    private String nome;
    private Date dataNascimento;

    public static AcolhidoResponse of(Acolhido acolhido){
        return AcolhidoResponse.builder()
                .id(acolhido.getId())
                .nome(acolhido.getNome())
                .dataNascimento(acolhido.getDataNascimento())
                .build();
    }
}
