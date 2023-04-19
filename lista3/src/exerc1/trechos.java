package exerc1;
public class trechos {
	

	static void horiz() {
	for (int comp = 1; comp < 11; comp++)
	System.out.print("*");
	System.out.println();
	}
	static void lado() {
	System.out.print("*");
	for (int espaco = 1; espaco <= 8; espaco++)
	System.out.print(" ");
	System.out.println("*");
	}
	
    public static void main(String[] args) {
	    System.out.println("Exercício a");
		for(int cont = 1; cont <= 5; cont++)
			System.out.println("Oi");
		System.out.println("Exercício b");
		
		for(int cont = 1; cont <= 5; cont++) System.out.print("Oi");
		
		System.out.println("Exercício c");
		
		for(int cont = 1; cont <= 3; cont++) {
			System.out.print("Oi");
			System.out.print(" Programador"); }
			
	    
		System.out.println("Exercício D");
		
	    	horiz();
	    	for (int vert = 1; vert < 4; vert++) lado();
	    	horiz();
	    	}
	    }

