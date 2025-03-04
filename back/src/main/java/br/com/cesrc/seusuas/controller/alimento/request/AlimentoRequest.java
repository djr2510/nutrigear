package br.com.cesrc.seusuas.controller.alimento.request;

import br.com.cesrc.seusuas.model.alimento.AlimentoModel;
import br.com.cesrc.seusuas.model.alimento.TipoAlimento;
import lombok.Builder;
import lombok.Data;

/**
 * Classe de requisição para criar ou atualizar um alimento.
 *
 * Esta classe define os dados necessários para criar ou atualizar um alimento,
 * incluindo informações nutricionais e vitaminas.
 */
@Builder
@Data
public class AlimentoRequest {

    /**
     * Identificador único do alimento.
     */
    private Long id;

    /**
     * Tipo do alimento.
     */
    private TipoAlimento tipo;

    /**
     * Nome do alimento.
     */
    private String nome;

    /**
     * Quantidade em gramas do alimento.
     */
    private int grama;

    /**
     * Valor energético do alimento.
     */
    private int valorEnergetico;

    /**
     * Quantidade de carboidratos no alimento.
     */
    private int carboidratos;

    /**
     * Quantidade de açúcares totais no alimento.
     */
    private int acucaresTotais;

    /**
     * Quantidade de açúcares adicionais no alimento.
     */
    private int acucaresAdicionais;

    /**
     * Quantidade de proteínas no alimento.
     */
    private int proteinas;

    /**
     * Quantidade de gorduras totais no alimento.
     */
    private int gorduraTotais;

    /**
     * Quantidade de gordura trans no alimento.
     */
    private int gorduraTrans;

    /**
     * Quantidade de gordura saturada no alimento.
     */
    private int gorduraSaturada;

    /**
     * Quantidade de fibras no alimento.
     */
    private int fibra;

    /**
     * Quantidade de sódio no alimento.
     */
    private int sodio;

    /**
     * Quantidade de vitamina A no alimento.
     */
    private int vitaminaA;

    /**
     * Quantidade de vitamina B no alimento.
     */
    private int vitaminaB;

    /**
     * Quantidade de vitamina C no alimento.
     */
    private int vitaminaC;

    /**
     * Quantidade de vitamina D no alimento.
     */
    private int vitaminaD;

    /**
     * Quantidade de vitamina E no alimento.
     */
    private int vitaminaE;

    /**
     * Quantidade de vitamina K no alimento.
     */
    private int vitaminaK;

    /**
     * Converte o objeto AlimentoRequest para um objeto AlimentoModel.
     *
     * @return Um objeto AlimentoModel com os dados da requisição.
     */
    public AlimentoModel toModel() {
        return AlimentoModel.builder()
                .id(id)
                .tipo(tipo)
                .nome(nome)
                .grama(grama)
                .valorEnergetico(valorEnergetico)
                .carboidratos(carboidratos)
                .acucaresTotais(acucaresTotais)
                .acucaresAdicionais(acucaresAdicionais)
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