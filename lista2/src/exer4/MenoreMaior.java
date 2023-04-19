package exer4;
import java.util.Scanner;
public class MenoreMaior {
  public static void main(String[] args) {
    // lê três valores inteiros do usuário
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o primeiro número: ");
    int a = scanner.nextInt();
    System.out.print("Digite o segundo número: ");
    int b = scanner.nextInt();
    System.out.print("Digite o terceiro número: ");
    int c = scanner.nextInt();
    scanner.close();

    // encontra o menor número
    int menor = a;
    if (b < menor) {
      menor = b;
    }
    if (c < menor) {
      menor = c;
    }

    // encontra o maior número
    int maior = a;
    if (b > maior) {
      maior = b;
    }
    if (c > maior) {
      maior = c;
    }

    // imprime o menor e o maior número
    System.out.println("O menor número é " + menor);
    System.out.println("O maior número é " + maior);
  }
}