package ex2;

public class EX2_Fibonacci {

	public static void main(String[] args) {
        int termoAnterior = 1;
        int termoAtual = 1;
        System.out.print("Fibonacci: ");
        System.out.print(termoAnterior + ", " + termoAtual);
        for (int i = 2; i < 20; i++) {
            int proximoTermo = termoAnterior + termoAtual;
            System.out.print(", " + proximoTermo);
            termoAnterior = termoAtual;
            termoAtual = proximoTermo;
        }
    }
	
}
