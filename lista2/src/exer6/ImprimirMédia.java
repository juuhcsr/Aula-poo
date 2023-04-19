package exer6;

import java.util.Scanner;

public class ImprimirMédia {

		  public static void main(String[] args) {
			    Scanner scanner = new Scanner(System.in);
			    System.out.print("Digite o primeiro número: ");
			    int a = scanner.nextInt();
			    System.out.print("Digite o segundo número: ");
			    int b = scanner.nextInt();
			    System.out.print("Digite o terceiro número: ");
			    int c = scanner.nextInt();
			    scanner.close();
			    float media = (a + b + c)/3;
			    	System.out.print("Média é "+ media);}
			    }
	
