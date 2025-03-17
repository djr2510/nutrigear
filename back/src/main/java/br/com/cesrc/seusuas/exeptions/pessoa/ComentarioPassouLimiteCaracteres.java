package br.com.cesrc.seusuas.exeptions.pessoa;

public class ComentarioPassouLimiteCaracteres extends RuntimeException {
    public ComentarioPassouLimiteCaracteres() {
        super();
    }
    public ComentarioPassouLimiteCaracteres(String mensagem) {
        super(mensagem);
    }

    public ComentarioPassouLimiteCaracteres(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

    public ComentarioPassouLimiteCaracteres(Throwable causa) {
        super(causa);
    }
}
