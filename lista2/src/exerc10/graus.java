package exerc10;

import java.util.Scanner;

public class graus {

	public static double conversorTemperatura(double temp, int conv) {
		  switch (conv) {
		    case 1: // Celsius para Fahrenheit
		      return (temp * 9/5) + 32;
		    case 2: // Fahrenheit para Celsius
		      return (temp - 32) * 5/9;
		    case 3: // Celsius para Kelvin
		      return temp + 273.15;
		    case 4: // Kelvin para Celsius
		      return temp - 273.15;
		    case 5: // Fahrenheit para Kelvin
		      return (temp + 459.67) * 5/9;
		    case 6: // Kelvin para Fahrenheit
		      return (temp * 9/5) - 459.67;
		    default: // conversão inválida
		      System.out.println("Conversão inválida.");
		      return 0;
		  }
		}
	  public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    System.out.print("Digite a temperatura que deseja calcular: ");
		    double temp = scanner.nextInt();
		    System.out.print(""
		    		+ "1: Celsius para Fahrenheit\n"
		    		+ "2: Fahrenheit para Celsius\n"
		    		+ "3: Celsius para Kelvin\n"
		    		+ "4: Kelvin para Celsius\n"
		    		+ "5: Fahrenheit para Kelvin\n"
		    		+ "6: Kelvin para Fahrenheit");
		    System.out.print("Digite o tipo de calculadora que deseja usar: ");
		    int conv = scanner.nextInt();
		    scanner.close();
		    double temperatura = conversorTemperatura(temp,conv);
		    System.out.print( "resultado :" + temperatura);
	  }
}
