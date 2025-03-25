package br.com.cesrc.seusuas.exeptions.pessoa;

public class EmailNaoEncontrado extends Exception {

    public EmailNaoEncontrado() {
        super();
    }

    public EmailNaoEncontrado(String mensagem) {
        super(mensagem);
    }

    public EmailNaoEncontrado(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

    public EmailNaoEncontrado(Throwable causa) {
        super(causa);
    }
}
