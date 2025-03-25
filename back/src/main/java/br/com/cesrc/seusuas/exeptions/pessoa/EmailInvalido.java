package br.com.cesrc.seusuas.exeptions.pessoa;

public class EmailInvalido extends Exception {

    public EmailInvalido() {
        super();
    }

    public EmailInvalido(String mensagem) {
        super(mensagem);
    }

    public EmailInvalido(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

    public EmailInvalido(Throwable causa) {
        super(causa);
    }
}
