package br.com.cesrc.seusuas.controller.alimento.request;

import br.com.cesrc.seusuas.model.alimento.AlimentoModel;
import br.com.cesrc.seusuas.model.alimento.TipoAlimento;
import br.com.cesrc.seusuas.model.artigo.ArtigoModel;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AlimentoRequest {


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
    private int gorduraSaturada;
    private int fibra;
    private int sodio;
    private int vitaminaA;
    private int vitaminaB;
    private int vitaminaC;
    private int vitaminaD;
    private int vitaminaE;
    private int vitaminaK;

    public AlimentoModel toModel(){
        return AlimentoModel.builder()
        .id(id)
        .tipo(tipo)
        .nome(nome)
        .grama(grama)
        .valorEnergetico(valorEnergetico)
        .carboidratos(carboidratos)
        .acucaresTotais(acucaresTotais)
        .proteinas(proteinas)
        .gorduraTotais(gorduraTotais)
        .gorduraTrans(gorduraTrans)
        .gorduraSaturada(gorduraSaturada)
        .fibra(fibra)
        .sodio(sodio)
        .vitaminaA(vitaminaA)
        .vitaminaB(vitaminaB)
        .vitaminaC(vitaminaC)
        .vitaminaD(vitaminaD)
        .vitaminaE(vitaminaE)
        .vitaminaK(vitaminaK)
        .build();
    }
}
