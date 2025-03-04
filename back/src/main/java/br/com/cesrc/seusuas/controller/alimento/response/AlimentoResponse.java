package br.com.cesrc.seusuas.controller.alimento.response;

import br.com.cesrc.seusuas.model.alimento.AlimentoModel;
import br.com.cesrc.seusuas.model.alimento.TipoAlimento;
import lombok.Builder;
import lombok.Data;

/**
 * Classe de resposta para alimentos.
 *
 * Esta classe define os dados que serão retornados ao cliente após a criação
 * ou atualização de um alimento, incluindo informações nutricionais e vitaminas.
 */
@Data
@Builder
public class AlimentoResponse {

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
     * Converte um objeto AlimentoModel para um objeto AlimentoResponse.
     *
     * @param alimentoModel Objeto AlimentoModel a ser convertido.
     * @return Um objeto AlimentoResponse com os dados do alimento.
     */
    public static AlimentoResponse of(AlimentoModel alimentoModel) {
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
                .gorduraSaturada(alimentoModel.getGorduraSaturada())
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