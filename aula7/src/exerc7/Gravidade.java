package exerc7;
import java.util.Scanner;
public class Gravidade {

	public static double calcularTempoQueda(double alturaEmCentimetros) {
        double alturaEmMetros = alturaEmCentimetros / 100;
        double gravidade = 9.8;
        double tempo = Math.sqrt((2 * alturaEmMetros) / gravidade);
        return tempo;
    }

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Qual é a altura em cm que o objeto está ?: ");
		double alturaEmCentimetros = scanner.nextDouble();
        double tempoQueda = calcularTempoQueda(alturaEmCentimetros);
    System.out.println("O Tempo de queda da altura "+alturaEmCentimetros+ " centrometros é de: " + tempoQueda + " segundos");
    }
}

