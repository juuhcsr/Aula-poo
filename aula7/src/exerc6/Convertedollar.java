package exerc6;

import java.util.Scanner;

public class Convertedollar {

	public static double convertedollar(double real) {
		return real*5.20;
		}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Você quer converter quantos dollares ?: ");
		double dollarx = scanner.nextDouble();
		double dollar= convertedollar(dollarx);
		System.out.println(dollarx+" Dolares em reais são "+dollar + " reais");
	
}
}