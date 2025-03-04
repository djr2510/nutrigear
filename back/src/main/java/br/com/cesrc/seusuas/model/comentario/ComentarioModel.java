package br.com.cesrc.seusuas.model.comentario;

import br.com.cesrc.seusuas.model.artigo.ArtigoModel;
import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

/**
 * Modelo que representa um comentário em um artigo.
 *
 * Esta classe define a estrutura de um comentário, incluindo o autor, o artigo ao qual pertence,
 * o conteúdo do comentário e a data de criação.
 *
 * TODO: Implementar funcionalidades adicionais como sistema de curtidas e respostas a comentários.
 */
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "comentarios")
public class ComentarioModel {

    /**
     * Identificador único do comentário.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Autor do comentário.
     *
     * Relacionamento Many-to-One com a entidade PessoaModel, indicando quem criou o comentário.
     */
    @ManyToOne
    @JoinColumn(name = "pessoa_id", nullable = false)
    private PessoaModel criador;

    /**
     * Artigo ao qual o comentário pertence.
     *
     * Relacionamento Many-to-One com a entidade ArtigoModel, indicando em qual artigo o comentário foi feito.
     */
    @ManyToOne
    @JoinColumn(name = "artigo_id", nullable = false)
    private ArtigoModel artigo;

    /**
     * Conteúdo do comentário.
     *
     * Armazena o texto do comentário.
     */
    @Column(nullable = false, columnDefinition = "TEXT")
    private String comentario;

    /**
     * Data e hora de criação do comentário.
     *
     * Armazena a data e hora em que o comentário foi criado.
     */
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date dataCriacao;

    /**
     * TODO: Implementar sistema de curtidas para comentários.
     * - Criar uma entidade `LikeComentarioModel` associada a `ComentarioModel` e `PessoaModel`.
     * - Criar um `@OneToMany` para armazenar os likes.
     * - Criar métodos para adicionar/remover likes.
     */

    /**
     * TODO: Criar a classe `RespostaComentarioModel` para permitir respostas a comentários.
     * - Cada resposta pode estar associada a um comentário.
     * - Criar um `@ManyToOne` para vincular a resposta ao comentário original.
     */

}