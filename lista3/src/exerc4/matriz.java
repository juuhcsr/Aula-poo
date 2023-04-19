package exerc4;

public class matriz {

	public static void desenharRetangulo(int n, int m) {
	    for (int i = 0; i < n; i++) { // laço para as linhas
	        for (int j = 0; j < m; j++) { // laço para as colunas
	            if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
	                System.out.print("*"); // se for a primeira ou última linha ou a primeira ou última coluna, imprime "*"
	            } else {
	                System.out.print(" "); // caso contrário, imprime um espaço em branco
	            }
	        }
	        System.out.println(); // pula para a próxima linha
	    }
	}

	
}
