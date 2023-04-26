package exerc15;

public class ContagemElementos {
	
	public static int contagemElementos(int[] valores, int x) {
	    int count = 0;
	    for(int valor : valores) {
	        if(valor == x) {
	            count++;
	        }
	    }
	    return count;
	}
}
