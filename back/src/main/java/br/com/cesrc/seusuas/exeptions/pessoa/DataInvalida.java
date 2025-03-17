package br.com.cesrc.seusuas.exeptions.pessoa;

public class DataInvalida extends Exception {

    public DataInvalida() {
        super();
    }

    public DataInvalida (String mensagem) {
        super(mensagem);
    }

    public DataInvalida(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

    public DataInvalida(Throwable causa) {
        super(causa);
    }
}
