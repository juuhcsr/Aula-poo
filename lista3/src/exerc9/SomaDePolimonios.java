package exerc9;

public class SomaDePolimonios {

	public static double[] somaPolinomios(double[] p1, double[] p2) {
	    int tam1 = p1.length;
	    int tam2 = p2.length;
	    int tam = Math.max(tam1, tam2);
	    double[] resultado = new double[tam];
	    
	    for (int i = 0; i < tam; i++) {
	        double coef1 = (i < tam1) ? p1[i] : 0;
	        double coef2 = (i < tam2) ? p2[i] : 0;
	        resultado[i] = coef1 + coef2;
	    }
	    
	    return resultado;
	}

	
}
