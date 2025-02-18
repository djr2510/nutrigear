package br.com.cesrc.seusuas.model.receita;

import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import br.com.cesrc.seusuas.model.pessoa.RestricoesAlimentar;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "receitas")
public class ReceitaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String texto;

    @Column
    private String descricao;

    @Column
    private String observacoes;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dataCriacao;

    @Column(nullable = true)
    private String imagem;

    /**
     * TODO
     * Deixar Like no artigo e numeros de like
     */
}
