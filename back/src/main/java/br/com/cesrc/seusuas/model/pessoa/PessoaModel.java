package br.com.cesrc.seusuas.model.pessoa;

import br.com.cesrc.seusuas.model.artigo.ArtigoModel;
import br.com.cesrc.seusuas.model.comentario.ComentarioModel;
import br.com.cesrc.seusuas.model.tags.OpcaoAlimentar;
import br.com.cesrc.seusuas.model.tags.RestricoesAlimentar;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "pessoas", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class PessoaModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false, length = 100)
        private String nome;

        @Column(nullable = false, unique = true, length = 100)
        private String email;

        @Column(nullable = false)
        @Temporal(TemporalType.DATE)
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
        private Date dataNascimento;

        @Column(nullable = false, length = 255)
        private String senha;

        @ElementCollection
        @CollectionTable(name = "pessoa_restricoes", joinColumns = @JoinColumn(name = "pessoa_id"))
        @Enumerated(EnumType.STRING)
        private List<RestricoesAlimentar> restricoesAlimentarList;

        @ElementCollection
        @CollectionTable(name = "pessoa_opcoes", joinColumns = @JoinColumn(name = "pessoa_id"))
        @Enumerated(EnumType.STRING)
        private List<OpcaoAlimentar> opcaoAlimentarList;

        @OneToMany(mappedBy = "criador", cascade = CascadeType.ALL, orphanRemoval = true)
        @JsonIgnore
        private List<ComentarioModel> comentarios;

        @OneToMany(mappedBy = "criador", cascade = CascadeType.ALL, orphanRemoval = true)
        @JsonIgnore
        private List<ArtigoModel> artigos;
}
