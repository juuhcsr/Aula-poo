package exerc9;
import java.util.Scanner;
public class Cor {

	static void cor(int identificador) {
		  switch (identificador) {
		    case 1:
		      System.out.println("verde");
		      break;
		    case 2:
		      System.out.println("amarelo");
		      break;
		    case 3:
		      System.out.println("azul");
		      break;
		    case 4:
		      System.out.println("branco");
		      break;
		    default:
		      System.out.println("identificador invalido");
		      break;
		  }
		}

	  public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    System.out.print("Digite o valor do identificador: ");
		    int a = scanner.nextInt();
		    scanner.close();
		    cor(a);
}
}
