package ex8;

import java.util.Scanner;

public class VerificaDigitosConsecutivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        boolean temDigitosConsecutivosIguais = false;
        int ultimoDigito = num % 10;
        num /= 10;

        while (num > 0) {
            int digito = num % 10;
            if (digito == ultimoDigito) {
                temDigitosConsecutivosIguais = true;
                break;
            }
            ultimoDigito = digito;
            num /= 10;
        }

        if (temDigitosConsecutivosIguais) {
            System.out.println("O número possui dois dígitos consecutivos iguais.");
        } else {
            System.out.println("O número não possui dois dígitos consecutivos iguais.");
        }

        sc.close();
    }
}

