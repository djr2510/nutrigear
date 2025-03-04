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

/**
 * Modelo que representa uma receita.
 *
 * Esta classe define a estrutura de uma receita, incluindo seu autor, título,
 * texto, descrição, observações, data de criação, imagem, restrições e opções alimentares.
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "receitas")
public class ReceitaModel {

    /**
     * Identificador único da receita.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Autor da receita.
     *
     * Relacionamento Many-to-One com a entidade PessoaModel, indicando quem criou a receita.
     */
    @ManyToOne
    @JoinColumn(name = "pessoa_id", nullable = false)
    @JsonIgnore
    private PessoaModel criador;

    /**
     * Título da receita.
     */
    @Column(nullable = false)
    private String titulo;

    /**
     * Texto completo da receita.
     */
    @Column(nullable = false, columnDefinition = "TEXT")
    private String texto;

    /**
     * Descrição da receita.
     */
    @Column(columnDefinition = "TEXT")
    private String descricao;

    /**
     * Observações adicionais sobre a receita.
     */
    @Column(columnDefinition = "TEXT")
    private String observacoes;

    /**
     * Data de criação da receita.
     */
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dataCriacao;

    /**
     * URL da imagem da receita.
     */
    @Column
    private String imagem;

    /**
     * Lista de restrições alimentares da receita.
     */
    @ElementCollection
    @CollectionTable(name = "receita_restricoes", joinColumns = @JoinColumn(name = "receita_id"))
    @Enumerated(EnumType.STRING)
    @JsonIgnore
    private List<RestricoesAlimentar> restricoesAlimentares;

    /**
     * Lista de opções alimentares da receita.
     */
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