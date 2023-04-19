package exerc7;

public class Sequencia {

	
	public static void main(String[] args) {
		float n = 10;
	System.out.println("Imprimindo sequencia iniciando em " + n);
	while (n>1){
		if (n % 2 == 0) 
			n = n/2;
		else n = 3*n + 1;
		System.out.println(n);
	}
	}
}
