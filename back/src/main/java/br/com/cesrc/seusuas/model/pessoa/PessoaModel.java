package br.com.cesrc.seusuas.model.pessoa;
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
        @Temporal(TemporalType.DATE)
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
        private Date dataNascimento;


        @Column(nullable = true)
        private List<RestricoesAlimentar> restricoesAlimentarList;

        @Column(nullable = true)
        private List<OpcaoAlimentar> opcaoAlimentarList;


/**
        @OneToMany(mappedBy = "acolhido", cascade = CascadeType.ALL)
        private List<Documento> documentos;

     @OneToMany(mappedBy = "acolhido", cascade = CascadeType.ALL)
     private List<Atendimento> atendimentodocumentos;


     */


    }
