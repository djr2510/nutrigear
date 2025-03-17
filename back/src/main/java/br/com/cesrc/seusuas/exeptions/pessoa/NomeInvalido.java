package br.com.cesrc.seusuas.exeptions.pessoa;

public class NomeInvalido extends Exception {
    public NomeInvalido() {
        super();
    }

    public NomeInvalido (String mensagem) {
        super(mensagem);
    }

    public NomeInvalido (String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

    public NomeInvalido(Throwable causa) {
        super(causa);
    }
}
