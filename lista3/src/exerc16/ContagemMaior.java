package exerc16;

public class ContagemMaior {

	public static void contagemMaior(int[] arranjo1, int[] arranjo2) {
	    int maior = arranjo1[0];
	    for(int i = 1; i < arranjo1.length; i++) {
	        if(arranjo1[i] > maior) {
	            maior = arranjo1[i];
	        }
	    }
	    int count = contagemElementos(arranjo2, maior);
	    System.out.printf("O número %d aparece %d vezes no arranjo2.\n", maior, count);
	}

	private static int contagemElementos(int[] arranjo2, int maior) {
		// TODO Auto-generated method stub
		return 0;
	}
}
