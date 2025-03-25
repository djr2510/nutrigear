package br.com.cesrc.seusuas.exeptions.pessoa;

public class SenhaInvalida extends Exception {

    public SenhaInvalida() {
        super();
    }

    public SenhaInvalida(String mensagem) {
        super(mensagem);
    }

    public SenhaInvalida(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

    public SenhaInvalida(Throwable causa) {
        super(causa);
    }
}
