package exer5;
import java.util.Scanner;
public class Media {
	  public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    System.out.print("Digite o primeiro número: ");
		    int a = scanner.nextInt();
		    System.out.print("Digite o segundo número: ");
		    int b = scanner.nextInt();
		    System.out.print("Digite o terceiro número: ");
		    int c = scanner.nextInt();
		    System.out.print("Digite o quarto número: ");
		    int d = scanner.nextInt();
		    scanner.close();
		    if ((a + b + c + d)/4>0 ) {
		    	System.out.print("Média maior que 0 ");}
		    else {
		    	System.out.print("Média menor ou igual a 0 ");
		    }
}
}
