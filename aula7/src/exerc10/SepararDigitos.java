package exerc10;

import java.util.Scanner;

public class SepararDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 5 dígitos: ");
        int numero = scanner.nextInt();

        if (String.valueOf(numero).length() != 5) {
            System.out.println("Número inválido. Por favor, digite um número de 5 dígitos.");
        } else {
            int digito1 = numero / 10000;
            int digito2 = (numero % 10000) / 1000;
            int digito3 = (numero % 1000) / 100;
            int digito4 = (numero % 100) / 10;
            int digito5 = numero % 10;

            System.out.println(digito1 + " " + digito2 + " " + digito3 + " " + digito4 + " " + digito5);
        }
    }
}

