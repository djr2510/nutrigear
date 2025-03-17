package br.com.cesrc.seusuas.exeptions.pessoa;

public class ReceitaNaoEncontrada extends RuntimeException {
  public ReceitaNaoEncontrada() {
    super();
  }
  public ReceitaNaoEncontrada(String mensagem) {
    super(mensagem);
  }

  public ReceitaNaoEncontrada(String mensagem, Throwable causa) {
    super(mensagem, causa);
  }

  public ReceitaNaoEncontrada(Throwable causa) {
    super(causa);
  }
}
