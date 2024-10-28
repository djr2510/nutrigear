package br.com.cesrc.seusuas.controller.request;

import br.com.cesrc.seusuas.model.Documento;
import br.com.cesrc.seusuas.model.TipoDocumento;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class DocumentoRequest {
    private static String numero;
    private static String tipo;

    public  Documento toModel(){
        return Documento.builder()
                .numero(numero)
                .tipo(TipoDocumento.valueOf(tipo))
                .build();
    }
    public  List<Documento> toModelList(List<DocumentoRequest> documentoRequestList){
        if(documentoRequestList == null || documentoRequestList.isEmpty()){
            return null;
        }
        return documentoRequestList.stream()
                .map(DocumentoRequest::toModel)
                .collect(Collectors.toList());
    }
}
