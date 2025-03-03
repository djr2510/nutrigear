package br.com.cesrc.seusuas.model.comentario;

import br.com.cesrc.seusuas.model.artigo.ArtigoModel;
import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
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
@Table(name = "comentarios")
public class ComentarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pessoa_id", nullable = false)
    private PessoaModel criador;

    @ManyToOne
    @JoinColumn(name = "artigo_id", nullable = false)
    private ArtigoModel artigo;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String comentario;

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
