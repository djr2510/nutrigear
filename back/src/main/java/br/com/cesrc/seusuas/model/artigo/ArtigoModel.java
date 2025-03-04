package br.com.cesrc.seusuas.model.artigo;

import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

/**
 * Modelo que representa um artigo.
 *
 * Esta classe define a estrutura de um artigo, incluindo seu autor, título,
 * texto, descrição, observações, data de criação e imagem.
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "artigos")
public class ArtigoModel {

    /**
     * Identificador único do artigo.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Autor do artigo.
     *
     * Relacionamento Many-to-One com a entidade PessoaModel, indicando quem criou o artigo.
     */
    @ManyToOne
    @JoinColumn(name = "pessoa_id", nullable = false)
    private PessoaModel criador;

    /**
     * Título do artigo.
     */
    @Column(nullable = false)
    private String titulo;

    /**
     * Texto completo do artigo.
     */
    @Column(nullable = false)
    private String texto;

    /**
     * Descrição do artigo.
     */
    @Column
    private String descricao;

    /**
     * Observações adicionais sobre o artigo.
     */
    @Column
    private String observacoes;

    /**
     * Data de criação do artigo.
     */
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dataCriacao;

    /**
     * URL da imagem do artigo.
     */
    @Column(nullable = true)
    private String imagem;

    /**
     * TODO: Implementar sistema de curtidas.
     * - Criar uma entidade `LikeModel` com relacionamento `@ManyToOne` para `ArtigoModel` e `PessoaModel`.
     * - Criar um campo `@OneToMany` para armazenar os likes.
     * - Criar métodos para adicionar/remover likes.
     */

    /**
     * Retorna uma representação em String do objeto ArtigoModel.
     *
     * @return Uma String contendo os dados do artigo.
     */
    @Override
    public String toString() {
        return "ArtigoModel{" +
                "id=" + id +
                ", criador=" + criador.getNome() +
                ", titulo='" + titulo + '\'' +
                ", texto='" + texto + '\'' +
                ", descricao='" + descricao + '\'' +
                ", observacoes='" + observacoes + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", imagem='" + imagem + '\'' +
                '}';
    }
}