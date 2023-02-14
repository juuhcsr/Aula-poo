package aula_1;

import java.util.Scanner;

public class exercício {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int nota1, nota2, nota3;
		int media, i, contAluno = 0;
		
		for (i = 0; i < 3; i++){
			
			contAluno++;
			//Recebe a primeira nota
			System.out.println("Aluno "+ contAluno +", digite sua 1ª nota");
			nota1 = ent.nextInt();
			
			//Recebe a segunda nota
			System.out.println("Aluno "+ contAluno +", digite sua 2ª nota");
			nota2 = ent.nextInt();
			
			//Recebe a terceira nota
			System.out.println("Aluno "+ contAluno +", digite sua 3ª nota");
			nota3 = ent.nextInt();
			
			// Calcula a média
			media = (nota1 + nota2 +nota3)/3;
			System.out.println("A média do aluno " + contAluno + " é " + media);
			
			// mostra a nota do aluno
			if( (media >= 0) && (media <4) ) {
				System.out.println("nota E, o aluno obteve a média " + media );
			}
			// mostra a nota do aluno
			else if (media >= 4 && media < 6) {
				System.out.println("nota D, o aluno obteve a média " + media );
			}
			else if (media >= 6 && media < 8) {
				System.out.println("nota C, o aluno obteve a média " + media );		
			}
			else if (media >= 8 && media < 9) {
				System.out.println("nota B, o aluno obteve a média " + media );		
			}
			else if (media >= 9 && media <= 10) {
				System.out.println("nota A, o aluno obteve a média " + media );		
			}
		}
	}
}

