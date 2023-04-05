package aula4;
import java.util.Scanner;
public class CalculoBhaskara {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int delta = 0;
		int a=0,b=0,c=0;
		double x1 = 0;
		double x2 = 0;
		System.out.print("Informe o valor de a: ");
		a = entrada.nextInt();
		System.out.print("Informe o valor de b: ");
		b = entrada.nextInt();
		System.out.print("Informe o valor de c: ");
		c = entrada.nextInt();		
		
		
		delta = calculaDelta(a,b,c);
		
		x1 = (-b+Math.sqrt(delta));
		x1 = x1/(2*a);
		
		x2 = (-b-Math.sqrt(delta));
		x2 = x2/(2*a);
		
		System.out.println("Delta: "+delta);
		System.out.println("x1: "+x1);
		System.out.println("x2: "+x2);
		
	}
	public static int calculaDelta(int a, int b, int c) {
		return (b*b)-4*a*c;
	}

}
