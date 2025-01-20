package br.com.cesrc.seusuas.model.alimento;

import br.com.cesrc.seusuas.model.pessoa.TipoDocumento;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@Entity
@Table(name = "alimento")
public class AlimentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoAlimento tipo;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 100)
    private int grama;
    @Column(nullable = false, length = 100)
    private int valorEnergetico;
    @Column(nullable = false, length = 100)
    private int carboidratos;
    @Column(nullable = false, length = 100)
    private int acucaresTotais;
    @Column(nullable = false, length = 100)
    private int acucaresAdicionais;
    @Column(nullable = false, length = 100)
    private int proteinas;
    @Column(nullable = false, length = 100)
    private int gorduraTotais;
    @Column(nullable = false, length = 100)
    private int gorduraTrans;
    @Column(nullable = false, length = 100)
    private int gotduraSaturada;
    @Column(nullable = false, length = 100)
    private int fibra;
    @Column(nullable = false, length = 100)
    private int sodio;
    @Column(nullable = false, length = 100)
    private int vitaminaA;
    @Column(nullable = false, length = 100)
    private int vitaminaB;
    @Column(nullable = false, length = 100)
    private int vitaminaC;
    @Column(nullable = false, length = 100)
    private int vitaminaD;
    @Column(nullable = false, length = 100)
    private int vitaminaE;
    @Column(nullable = false, length = 100)
    private int vitaminaK;

    public AlimentoModel(Long id, TipoAlimento tipo, String nome, int grama, int valorEnergetico, int carboidratos, int acucaresTotais, int acucaresAdicionais, int proteinas, int gorduraTotais, int gorduraTrans, int gotduraSaturada, int fibra, int sodio, int vitaminaA, int getVitaminaB, int getVitaminaC, int getVitaminaD, int getVitaminaE, int getVitaminaK) {

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
        this.gotduraSaturada = gotduraSaturada;
        this.fibra = fibra;
        this.sodio = sodio;
        this.vitaminaA = vitaminaA;
        this.vitaminaB = getVitaminaB;
        this.vitaminaC = getVitaminaC;
        this.vitaminaD = getVitaminaD;
        this.vitaminaE = getVitaminaE;
        this.vitaminaK = getVitaminaK;
    }


}
