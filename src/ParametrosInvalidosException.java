public class ParametrosInvalidosException extends Exception {

  public ParametrosInvalidosException() {
    super("Parâmetros inválidos.");
  }

  public ParametrosInvalidosException(String mensagem) {
    super(mensagem);
  }
}
