package exer2;

import java.util.Scanner;

public class ValorN {
	
	// função que obtem o módulo do valor
	static double modulo(double n) {
		if (n < 0 ) {return -n;}
			else { return n; }
		}
	 public static void main(String[] args) {
		    // lê um valor double do usuário
		    Scanner scanner = new Scanner(System.in);
		    System.out.print("Digite um número: ");
		    double num = scanner.nextDouble();
		    scanner.close();
		    
		    // calcula o módulo do número e imprime o resultado
		    double mod = modulo(num);
		    System.out.println("O módulo de " + num + " é " + mod);
		  }
		}
