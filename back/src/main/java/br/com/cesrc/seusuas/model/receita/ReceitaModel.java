package br.com.cesrc.seusuas.model.receita;

import br.com.cesrc.seusuas.model.tags.OpcaoAlimentar;
import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import br.com.cesrc.seusuas.model.tags.RestricoesAlimentar;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "receitas")
public class ReceitaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pessoa_id", nullable = false)
    @JsonIgnore
    private PessoaModel criador;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String texto;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    @Column(columnDefinition = "TEXT")
    private String observacoes;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dataCriacao;

    @Column
    private String imagem;

    @ElementCollection
    @CollectionTable(name = "receita_restricoes", joinColumns = @JoinColumn(name = "receita_id"))
    @Enumerated(EnumType.STRING)
    @JsonIgnore
    private List<RestricoesAlimentar> restricoesAlimentares;

    @ElementCollection
    @CollectionTable(name = "receita_opcoes", joinColumns = @JoinColumn(name = "receita_id"))
    @Enumerated(EnumType.STRING)
    @JsonIgnore
    private List<OpcaoAlimentar> opcoesAlimentares;

/**
 * TODO: Implementar sistema de curtidas para receitas.
 * - Criar uma entidade `LikeModel` com relacionamento `@ManyToOne` para `ReceitaModel` e `PessoaModel`.
 * - Adicionar um campo `@OneToMany` em `ReceitaModel` para armazenar os likes.
 * - Implementar métodos para adicionar e remover curtidas de receitas.
 */


}
