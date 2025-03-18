package br.com.cesrc.seusuas.model.alimento;

import jakarta.persistence.*;
import lombok.*;

/**
 * Modelo que representa um alimento.
 *
 * Esta classe define a estrutura de um alimento, incluindo seu tipo, nome,
 * informações nutricionais e vitaminas.
 */
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@Entity
@Table(name = "alimentos")
public class AlimentoModel {

    /**
     * Identificador único do alimento.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Tipo do alimento (ex: fruta, legume, etc.).
     */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoAlimento tipo;

    /**
     * Nome do alimento.
     */
    @Column(nullable = false, length = 100)
    private String nome;

    /**
     * Quantidade em gramas do alimento.
     */
    @Column(nullable = false, length = 100)
    private Integer grama;

    /**
     * Valor energético do alimento.
     */
    @Column(nullable = false, length = 100)
    private Integer valorEnergetico;

    /**
     * Quantidade de carboidratos no alimento.
     */
    @Column(nullable = false, length = 100)
    private Integer carboidratos;

    /**
     * Quantidade de açúcares totais no alimento.
     */
    @Column(nullable = false, length = 100)
    private Integer acucaresTotais;

    /**
     * Quantidade de açúcares adicionais no alimento.
     */
    @Column(nullable = false, length = 100)
    private Integer acucaresAdicionais;

    /**
     * Quantidade de proteínas no alimento.
     */
    @Column(nullable = false, length = 100)
    private Integer proteinas;

    /**
     * Quantidade de gorduras totais no alimento.
     */
    @Column(nullable = false, length = 100)
    private Integer gorduraTotais;

    /**
     * Quantidade de gordura trans no alimento.
     */
    @Column(nullable = false, length = 100)
    private Integer gorduraTrans;

    /**
     * Quantidade de gordura saturada no alimento.
     */
    @Column(nullable = false, length = 100)
    private Integer gorduraSaturada;

    /**
     * Quantidade de fibras no alimento.
     */
    @Column(nullable = false, length = 100)
    private Integer fibra;

    /**
     * Quantidade de sódio no alimento.
     */
    @Column(nullable = false, length = 100)
    private Integer sodio;

    /**
     * Quantidade de vitamina A no alimento.
     */
    @Column(nullable = false, length = 100)
    private Integer vitaminaA;

    /**
     * Quantidade de vitamina B no alimento.
     */
    @Column(nullable = false, length = 100)
    private Integer vitaminaB;

    /**
     * Quantidade de vitamina C no alimento.
     */
    @Column(nullable = false, length = 100)
    private Integer vitaminaC;

    /**
     * Quantidade de vitamina D no alimento.
     */
    @Column(nullable = false, length = 100)
    private Integer vitaminaD;

    /**
     * Quantidade de vitamina E no alimento.
     */
    @Column(nullable = false, length = 100)
    private Integer vitaminaE;

    /**
     * Quantidade de vitamina K no alimento.
     */
    @Column(nullable = false, length = 100)
    private Integer vitaminaK;

    /**
     * Construtor com todos os campos.
     *
     * @param id Identificador único do alimento.
     * @param tipo Tipo do alimento.
     * @param nome Nome do alimento.
     * @param grama Quantidade em gramas.
     * @param valorEnergetico Valor energético.
     * @param carboidratos Quantidade de carboidratos.
     * @param acucaresTotais Quantidade de açúcares totais.
     * @param acucaresAdicionais Quantidade de açúcares adicionais.
     * @param proteinas Quantidade de proteínas.
     * @param gorduraTotais Quantidade de gorduras totais.
     * @param gorduraTrans Quantidade de gordura trans.
     * @param gorduraSaturada Quantidade de gordura saturada.
     * @param fibra Quantidade de fibras.
     * @param sodio Quantidade de sódio.
     * @param vitaminaA Quantidade de vitamina A.
     * @param vitaminaB Quantidade de vitamina B.
     * @param vitaminaC Quantidade de vitamina C.
     * @param vitaminaD Quantidade de vitamina D.
     * @param vitaminaE Quantidade de vitamina E.
     * @param vitaminaK Quantidade de vitamina K.
     */
    public AlimentoModel(Long id, TipoAlimento tipo, String nome, Integer grama, Integer valorEnergetico, Integer carboidratos, Integer acucaresTotais, Integer acucaresAdicionais, Integer proteinas, Integer gorduraTotais, Integer gorduraTrans, Integer gorduraSaturada, Integer fibra, Integer sodio, Integer vitaminaA, Integer vitaminaB, Integer vitaminaC, Integer vitaminaD, Integer vitaminaE, Integer vitaminaK) {
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.grama = grama;
        this.valorEnergetico = valorEnergetico;
        this.carboidratos = carboidratos;
        this.acucaresTotais = acucaresTotais;
        this.acucaresAdicionais = acucaresAdicionais;
        this.proteinas = proteinas;
        this.gorduraTotais = gorduraTotais;
        this.gorduraTrans = gorduraTrans;
        this.gorduraSaturada = gorduraSaturada;
        this.fibra = fibra;
        this.sodio = sodio;
        this.vitaminaA = vitaminaA;
        this.vitaminaB = vitaminaB;
        this.vitaminaC = vitaminaC;
        this.vitaminaD = vitaminaD;
        this.vitaminaE = vitaminaE;
        this.vitaminaK = vitaminaK;
    }
}