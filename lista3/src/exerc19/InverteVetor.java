package exerc19;

public class InverteVetor {

	static void inverteVec(int[] vec) {
	    int length = vec.length;
	    for (int i = 0; i < length / 2; i++) {
	        int temp = vec[i];
	        vec[i] = vec[length - i - 1];
	        vec[length - i - 1] = temp;
	    }
	}

}
