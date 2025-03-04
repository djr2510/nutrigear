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

/**
 * Modelo que representa uma pessoa.
 *
 * Esta classe define a estrutura de uma pessoa, incluindo seus dados pessoais,
 * restrições e opções alimentares, comentários e artigos criados.
 */
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pessoas", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class PessoaModel {

        /**
         * Identificador único da pessoa.
         */
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        /**
         * Nome da pessoa.
         */
        @Column(nullable = false, length = 100)
        private String nome;

        /**
         * Endereço de e-mail da pessoa (deve ser único).
         */
        @Column(nullable = false, unique = true, length = 100)
        private String email;

        /**
         * Data de nascimento da pessoa.
         */
        @Column(nullable = false)
        @Temporal(TemporalType.DATE)
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
        private Date dataNascimento;

        /**
         * Senha da pessoa.
         */
        @Column(nullable = false, length = 255)
        private String senha;

        /**
         * Lista de restrições alimentares da pessoa.
         */
        @ElementCollection
        @CollectionTable(name = "pessoa_restricoes", joinColumns = @JoinColumn(name = "pessoa_id"))
        @Enumerated(EnumType.STRING)
        private List<RestricoesAlimentar> restricoesAlimentarList;

        /**
         * Lista de opções alimentares da pessoa.
         */
        @ElementCollection
        @CollectionTable(name = "pessoa_opcoes", joinColumns = @JoinColumn(name = "pessoa_id"))
        @Enumerated(EnumType.STRING)
        private List<OpcaoAlimentar> opcaoAlimentarList;

        /**
         * Lista de comentários criados pela pessoa.
         *
         * Relacionamento One-to-Many com a entidade ComentarioModel.
         */
        @OneToMany(mappedBy = "criador", cascade = CascadeType.ALL, orphanRemoval = true)
        @JsonIgnore
        private List<ComentarioModel> comentarios;

        /**
         * Lista de artigos criados pela pessoa.
         *
         * Relacionamento One-to-Many com a entidade ArtigoModel.
         */
        @OneToMany(mappedBy = "criador", cascade = CascadeType.ALL, orphanRemoval = true)
        @JsonIgnore
        private List<ArtigoModel> artigos;
}