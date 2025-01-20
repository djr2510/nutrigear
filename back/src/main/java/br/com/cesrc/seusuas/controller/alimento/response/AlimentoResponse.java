package br.com.cesrc.seusuas.controller.alimento.response;

import br.com.cesrc.seusuas.controller.pessoa.response.PessoaResponse;
import br.com.cesrc.seusuas.model.alimento.AlimentoModel;
import br.com.cesrc.seusuas.model.alimento.TipoAlimento;
import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class AlimentoResponse {
    private Long id;
    private TipoAlimento tipo;
    private String nome;
    private int grama;
    private int valorEnergetico;
    private int carboidratos;
    private int acucaresTotais;
    private int acucaresAdicionais;
    private int proteinas;
    private int gorduraTotais;
    private int gorduraTrans;
    private int gotduraSaturada;
    private int fibra;
    private int sodio;
    private int vitaminaA;
    private int vitaminaB;
    private int vitaminaC;
    private int vitaminaD;
    private int vitaminaE;
    private int vitaminaK;

    public static br.com.cesrc.seusuas.controller.alimento.response.AlimentoResponse of(AlimentoModel alimentoModel){
    return AlimentoResponse.builder()
            .id(alimentoModel.getId())
            .tipo(alimentoModel.getTipo())
            .nome(alimentoModel.getNome())
            .grama(alimentoModel.getGrama())
            .valorEnergetico(alimentoModel.getValorEnergetico())
            .carboidratos(alimentoModel.getCarboidratos())
            .acucaresTotais(alimentoModel.getAcucaresTotais())
            .acucaresAdicionais(alimentoModel.getAcucaresAdicionais())
            .proteinas(alimentoModel.getProteinas())
            .gorduraTotais(alimentoModel.getGorduraTotais())
            .gorduraTrans(alimentoModel.getGorduraTrans())
            .gotduraSaturada(alimentoModel.getGotduraSaturada())
            .fibra(alimentoModel.getFibra())
            .sodio(alimentoModel.getSodio())
            .vitaminaA(alimentoModel.getVitaminaA())
            .vitaminaB(alimentoModel.getVitaminaB())
            .vitaminaC(alimentoModel.getVitaminaC())
            .vitaminaD(alimentoModel.getVitaminaD())
            .vitaminaE(alimentoModel.getVitaminaE())
            .vitaminaK(alimentoModel.getVitaminaK())
            .build();
        }

}
