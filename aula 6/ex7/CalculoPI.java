package ex7;

import java.util.Scanner;

public class CalculoPI {

    public static double calcularPI(int iteracoes) {
        double pi = 0;
        boolean soma = true;
        for (int i = 1; i <= iteracoes; i++) {
            double parcela = 4.0 / (2 * i - 1);
            if (soma) {
                pi += parcela;
            } else {
                pi -= parcela;
            }
            soma = !soma;
        }
        return pi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de iterações desejado: ");
        int iteracoes = sc.nextInt();
        double pi = calcularPI(iteracoes);
        System.out.println("Valor de PI com " + iteracoes + " iterações: " + pi);
    }
}

