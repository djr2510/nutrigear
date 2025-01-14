package br.com.cesrc.seusuas.model.pessoa;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity@Table(name = "documentos")
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoDocumento tipo;

    @Column(nullable = true, length = 100)
    private String numero;

    @Column(nullable = true)
    private String orgaoEmissor;

    @Column(nullable = true)
    private LocalDateTime dataEmissao;

    @Column(nullable = true)
    private LocalDateTime dataValidade;

    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private PessoaModel pessoa;


}
