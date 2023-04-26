package exerc17;

public class ContagemTodos {

	public static void contagemTodos(int[] arranjo1, int[] arranjo2) {
	    for(int valor : arranjo1) {
	        int count = contagemElementos(arranjo2, valor);
	        System.out.printf("O número %d aparece %d vezes no arranjo2.\n", valor, count);
	    }
	}

	private static int contagemElementos(int[] arranjo2, int valor) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
