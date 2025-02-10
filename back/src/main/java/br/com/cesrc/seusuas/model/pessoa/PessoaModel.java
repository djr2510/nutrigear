package br.com.cesrc.seusuas.model.pessoa;
import br.com.cesrc.seusuas.model.artigo.ArtigoModel;
import br.com.cesrc.seusuas.model.comentario.ComentarioModel;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "pessoas")
public class PessoaModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false, length = 100)
        private String nome;

        @Column(nullable = false)
        private String email;

        @Column(nullable = false)
        @Temporal(TemporalType.DATE)
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
        private Date dataNascimento;

        @Column(nullable = false)
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
        private List<ComentarioModel> comentarios;

        @OneToMany(mappedBy = "criador", cascade = CascadeType.ALL, orphanRemoval = true)
        private List<ArtigoModel> artigos;
    }
