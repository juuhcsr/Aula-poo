package exerc18;

public class ValorSubsequente {

	public static boolean verificaSubsequencia(int[] vec, int[] sub) {
	    int i = 0;
	    for(int valor : vec) {
	        if(valor == sub[i]) {
	            i++;
	            if(i == sub.length) {
	                return true;
	            }
	        }
	    }
	    return false;
	}
	
	
	
}
