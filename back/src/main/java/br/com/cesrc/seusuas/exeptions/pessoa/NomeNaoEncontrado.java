package br.com.cesrc.seusuas.exeptions.pessoa;

public class NomeNaoEncontrado extends Exception {

    public NomeNaoEncontrado() {
        super();
    }

    public NomeNaoEncontrado(String mensagem) {
        super(mensagem);
    }

    public NomeNaoEncontrado(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

    public NomeNaoEncontrado(Throwable causa) {
        super(causa);
    }
}