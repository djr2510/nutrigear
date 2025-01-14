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
    private int getVitaminaB;
    @Column(nullable = false, length = 100)
    private int getVitaminaC;
    @Column(nullable = false, length = 100)
    private int getVitaminaD;
    @Column(nullable = false, length = 100)
    private int getVitaminaE;
    @Column(nullable = false, length = 100)
    private int getVitaminaK;

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
        this.getVitaminaB = getVitaminaB;
        this.getVitaminaC = getVitaminaC;
        this.getVitaminaD = getVitaminaD;
        this.getVitaminaE = getVitaminaE;
        this.getVitaminaK = getVitaminaK;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoAlimento getTipo() {
        return tipo;
    }

    public void setTipo(TipoAlimento tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGrama() {
        return grama;
    }

    public void setGrama(int grama) {
        this.grama = grama;
    }

    public int getValorEnergetico() {
        return valorEnergetico;
    }

    public void setValorEnergetico(int valorEnergetico) {
        this.valorEnergetico = valorEnergetico;
    }

    public int getCarboidratos() {
        return carboidratos;
    }

    public void setCarboidratos(int carboidratos) {
        this.carboidratos = carboidratos;
    }

    public int getAcucaresTotais() {
        return acucaresTotais;
    }

    public void setAcucaresTotais(int acucaresTotais) {
        this.acucaresTotais = acucaresTotais;
    }

    public int getAcucaresAdicionais() {
        return acucaresAdicionais;
    }

    public void setAcucaresAdicionais(int acucaresAdicionais) {
        this.acucaresAdicionais = acucaresAdicionais;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

    public int getGorduraTotais() {
        return gorduraTotais;
    }

    public void setGorduraTotais(int gorduraTotais) {
        this.gorduraTotais = gorduraTotais;
    }

    public int getGorduraTrans() {
        return gorduraTrans;
    }

    public void setGorduraTrans(int gorduraTrans) {
        this.gorduraTrans = gorduraTrans;
    }

    public int getGotduraSaturada() {
        return gotduraSaturada;
    }

    public void setGotduraSaturada(int gotduraSaturada) {
        this.gotduraSaturada = gotduraSaturada;
    }

    public int getFibra() {
        return fibra;
    }

    public void setFibra(int fibra) {
        this.fibra = fibra;
    }

    public int getSodio() {
        return sodio;
    }

    public void setSodio(int sodio) {
        this.sodio = sodio;
    }

    public int getVitaminaA() {
        return vitaminaA;
    }

    public void setVitaminaA(int vitaminaA) {
        this.vitaminaA = vitaminaA;
    }

    public int getGetVitaminaB() {
        return getVitaminaB;
    }

    public void setGetVitaminaB(int getVitaminaB) {
        this.getVitaminaB = getVitaminaB;
    }

    public int getGetVitaminaC() {
        return getVitaminaC;
    }

    public void setGetVitaminaC(int getVitaminaC) {
        this.getVitaminaC = getVitaminaC;
    }

    public int getGetVitaminaD() {
        return getVitaminaD;
    }

    public void setGetVitaminaD(int getVitaminaD) {
        this.getVitaminaD = getVitaminaD;
    }

    public int getGetVitaminaE() {
        return getVitaminaE;
    }

    public void setGetVitaminaE(int getVitaminaE) {
        this.getVitaminaE = getVitaminaE;
    }

    public int getGetVitaminaK() {
        return getVitaminaK;
    }

    public void setGetVitaminaK(int getVitaminaK) {
        this.getVitaminaK = getVitaminaK;
    }
}
