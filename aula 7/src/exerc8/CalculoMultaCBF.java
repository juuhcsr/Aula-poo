package exerc8;

import java.util.Scanner;

public class CalculoMultaCBF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do time: ");
        int numeroTime = scanner.nextInt();

        System.out.print("Digite o número do jogador: ");
        int numeroJogador = scanner.nextInt();

        System.out.print("Digite o número de cartões amarelos do jogador: ");
        int numeroCartoesAmarelos = scanner.nextInt();

        System.out.print("Digite o número de cartões vermelhos do jogador: ");
        int numeroCartoesVermelhos = scanner.nextInt();

        double valorMultaAmarelo = numeroCartoesAmarelos * 1000.20;
        double valorMultaVermelho = numeroCartoesVermelhos * 4523.75;
        double valorMultaTotal = valorMultaAmarelo + valorMultaVermelho;

        System.out.println("o jogador número " + numeroJogador + " do time " + numeroTime + " teve a multa de : R$" + valorMultaTotal);
    }
}

