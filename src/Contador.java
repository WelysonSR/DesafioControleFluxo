import java.util.Scanner;

public class Contador {
  public static void main(String[] args) throws ParametrosInvalidosException {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Digite o primeiro parâmetro");
      int parametroUm = scanner.nextInt();
      System.out.println("Digite o segundo parâmetro");
      int parametroDois = scanner.nextInt();

      if (parametroUm >= parametroDois) {
        throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
      }

      contar(parametroUm, parametroDois);

    } catch (NumberFormatException e) {
      System.err.println("Erro: Os parâmetros informados devem ser números inteiros.");
    }
  }

  static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    int contagem = parametroDois - parametroUm;

    for (int i = 1; i <= contagem; i += 1) {
      System.out.println("Imprimindo o número " + i);
    }
  }
}
