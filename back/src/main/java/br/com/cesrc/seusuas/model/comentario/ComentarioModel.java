package br.com.cesrc.seusuas.model.comentario;

import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

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

    @Column(nullable = false, length = 255)
    private String comentario;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dataCriacao;

    /**
     * TODO
     *  Likes no Comentarios, quantos tem e dar likes
     */

    /**
     * TODO
     *  Responder o Comentario com uma outra classe
     */
}
