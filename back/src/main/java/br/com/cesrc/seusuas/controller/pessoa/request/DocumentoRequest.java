package br.com.cesrc.seusuas.controller.pessoa.request;

import br.com.cesrc.seusuas.model.pessoa.Documento;
import br.com.cesrc.seusuas.model.pessoa.TipoDocumento;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe de requisição para documentos de uma pessoa.
 *
 * Esta classe define os dados necessários para criar ou atualizar um documento,
 * incluindo número e tipo do documento.
 */
@Data
@Builder
public class DocumentoRequest {

    /**
     * Número do documento.
     */
    private String numero;

    /**
     * Tipo do documento.
     */
    private String tipo;

    /**
     * Converte o objeto DocumentoRequest para um objeto Documento.
     *
     * @return Um objeto Documento com os dados da requisição.
     */
    public Documento toModel() {
        return Documento.builder()
                .numero(numero)
                .tipo(TipoDocumento.valueOf(tipo))
                .build();
    }

    /**
     * Converte uma lista de DocumentoRequest para uma lista de Documento.
     *
     * @param documentoRequestList Lista de objetos DocumentoRequest a serem convertidos.
     * @return Uma lista de objetos Documento com os dados das requisições.
     */
    public List<Documento> toModelList(List<DocumentoRequest> documentoRequestList) {
        if (documentoRequestList == null || documentoRequestList.isEmpty()) {
            return null;
        }
        return documentoRequestList.stream()
                .map(DocumentoRequest::toModel)
                .collect(Collectors.toList());
    }
}