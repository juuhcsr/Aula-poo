package exerc6;

public class MaiorElemento {

	public static float maiorElemento(float[] arranjo) {
	    float maior = arranjo[0];
	    for (int i = 1; i < arranjo.length; i++) {
	        if (arranjo[i] > maior) {
	            maior = arranjo[i];
	        }
	    }
	    System.out.println("Maior elemento: " + maior);
	    return maior;
	}

	
}
