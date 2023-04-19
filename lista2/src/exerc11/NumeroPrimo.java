package exerc11;

public class NumeroPrimo {
	static boolean isPrime(int val) {
	    if (val <= 1) {
	        System.out.println("O número deve ser positivo e maior do que 1.");
	        return false;
	    }
	    int i = 2;
	    while (i < val) {
	        if (val % i == 0) {
	            return false;
	        }
	        i++;
	    }
	    return true;
	}
	public static void main(String[] args) {
		int num = 8;
		if (isPrime(num)) {
		    System.out.println(num + " é primo");
		} else {
		    System.out.println(num + " não é primo");
		}

}
}
