package ex1;

import java.util.Scanner;

public class EX1_Tabuada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro e positivo para a tabuada: ");
        int numero = scanner.nextInt();
        if (numero <= 0) {
            System.out.println("O número digitado deve ser positivo!");
            return;
        }
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 0; i <= 9; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}