package exerc8;

public class MédiaDescartandoMaioreMenor {

	public static int indiceMaiorElemento(float[] arranjo) {
	    float maior = arranjo[0];
	    int indiceMaior = 0;
	    for (int i = 1; i < arranjo.length; i++) {
	        if (arranjo[i] > maior) {
	            maior = arranjo[i];
	            indiceMaior = i;
	        }
	    }
	    System.out.println("Índice do maior elemento: " + indiceMaior);
	    return indiceMaior;
	}

	
}
