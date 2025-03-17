package br.com.cesrc.seusuas.exeptions.pessoa;

public class AlimentoNaoEncontrado extends RuntimeException {
  public AlimentoNaoEncontrado() {
    super();
  }
  public AlimentoNaoEncontrado(String mensagem) {
    super(mensagem);
  }

  public AlimentoNaoEncontrado (String mensagem, Throwable causa) {
    super(mensagem, causa);
  }

  public AlimentoNaoEncontrado(Throwable causa) {
    super(causa);
  }}
