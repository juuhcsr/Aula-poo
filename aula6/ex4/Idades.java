package ex4;

import java.util.Scanner;

public class Idades {
    private int[] idades;

    public Idades() {
        idades = new int[5];
    }

    public void lerIdades() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = input.nextInt();
        }
    }

    public int idadeMaisNova() {
        int maisNova = idades[0];
        for (int i = 1; i < 5; i++) {
            if (idades[i] < maisNova) {
                maisNova = idades[i];
            }
        }
        return maisNova;
    }

    public double idadeMedia() {
        int somaIdades = 0;
        for (int i = 0; i < 5; i++) {
            somaIdades += idades[i];
        }
        return (double) somaIdades / 5;
    }

    public double porcentagemEntre24e30() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (idades[i] >= 24 && idades[i] <= 30) {
                count++;
            }
        }
        return (double) count / 5 * 100;
    }
}