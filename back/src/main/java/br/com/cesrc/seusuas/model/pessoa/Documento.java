package br.com.cesrc.seusuas.model.pessoa;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

/**
 * Modelo que representa um documento associado a uma pessoa.
 *
 * Esta classe define a estrutura de um documento, incluindo seu tipo, número,
 * órgão emissor, datas de emissão e validade, e a pessoa a qual pertence.
 */
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "documentos")
public class Documento {

    /**
     * Identificador único do documento.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Tipo do documento (ex: RG, CPF, etc.).
     */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoDocumento tipo;

    /**
     * Número do documento.
     */
    @Column(nullable = true, length = 100)
    private String numero;

    /**
     * Órgão emissor do documento.
     */
    @Column(nullable = true)
    private String orgaoEmissor;

    /**
     * Data de emissão do documento.
     */
    @Column(nullable = true)
    private LocalDateTime dataEmissao;

    /**
     * Data de validade do documento.
     */
    @Column(nullable = true)
    private LocalDateTime dataValidade;

    /**
     * Pessoa a qual o documento pertence.
     *
     * Relacionamento Many-to-One com a entidade PessoaModel.
     */
    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private PessoaModel pessoa;
}