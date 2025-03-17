package br.com.cesrc.seusuas.exeptions.pessoa;

public class ComentarioVazio extends RuntimeException {
  public ComentarioVazio() {
    super();
  }
    public ComentarioVazio(String mensagem) {
        super(mensagem);
    }

  public ComentarioVazio (String mensagem, Throwable causa) {
    super(mensagem, causa);
  }

  public ComentarioVazio(Throwable causa) {
    super(causa);
  }
}
