package aula10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Tabuada {

	public static void main(String[] args) throws IOException {
			
			//calcula tabuada 
	 Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro e positivo para a tabuada: ");
        int numero = scanner.nextInt();
        if (numero <= 0) {
            System.out.println("O número digitado deve ser positivo!");
            return;
        }
		
		// cria arquivo 
        File file = new File ("tabuada_"+numero);
        if (!file.exists()) {
	       FileWriter f = new FileWriter("tabuada_"+numero);
	       for (int i = 1; i <= 10; i++) {
	            int resultado = numero * i;
	            f.write(numero + " x " + i + " = " + resultado +"\n"); 
	       }
	       f.close();
	}
        else { System.out.println(" arquivo já existe");
        	System.exit(0);
        }
        
	}
}
			//System.out.println("Apagando");
			//f.delete();
