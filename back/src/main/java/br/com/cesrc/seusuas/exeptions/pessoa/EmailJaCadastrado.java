package br.com.cesrc.seusuas.exeptions.pessoa;

public class EmailJaCadastrado extends RuntimeException {
    public EmailJaCadastrado() {
        super();
    }

    public EmailJaCadastrado(String mensagem) {
        super(mensagem);
    }

    public EmailJaCadastrado (String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

    public EmailJaCadastrado(Throwable causa) {
        super(causa);
    }
}
