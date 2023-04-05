package exerc9;
import java.util.Scanner;
public class Calculo {
	
	public static double soma(double a, double b) {
		return a + b;
		}
	public static double produto(double a, double b) {
		return a * b;
		}
	public static double diferença(double a, double b) {
		return a - b;
		}
	public static double divisão(double a, double b) {
		return a / b;
		}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor de a: ");
		double a = scanner.nextDouble();
		System.out.println("Digite o valor de b: ");
		double b = scanner.nextDouble();
		System.out.println(" valor de a: "+ a + "\n valor de b: " + b );
		System.out.println(" soma de a + b = " + soma(a,b) );
		System.out.println(" produto de a * b = " + produto(a,b) );
		System.out.println(" diferença de a - b = " + diferença(a,b) );
		System.out.println(" divisão de a / b = " + divisão(a,b) );
	}

}
