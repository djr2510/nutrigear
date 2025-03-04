package br.com.cesrc.seusuas.model.pessoa;

/**
 * Enumeração que representa os tipos de documentos de uma pessoa.
 *
 * Esta enumeração define os tipos de documentos que podem ser associados a uma PessoaModel,
 * como CPF, RG, Certidão de Nascimento, Registro Profissional, NIS e CTPS.
 */
public enum TipoDocumento {

    /**
     * Cadastro de Pessoa Física (CPF).
     */
    CPF,

    /**
     * Registro Geral (RG).
     */
    RG,

    /**
     * Certidão de Nascimento.
     */
    CERTIDAO_NASCIMENTO,

    /**
     * Registro Profissional.
     */
    REGISTRO_PROFISSIONAL,

    /**
     * Número de Identificação Social (NIS).
     */
    NIS,

    /**
     * Carteira de Trabalho e Previdência Social (CTPS).
     */
    CTPS
}