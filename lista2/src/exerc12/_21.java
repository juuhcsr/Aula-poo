package exerc12;

	import java.util.Scanner;

public class _21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma = 0;
        
        while (soma < 21) {
            System.out.print("Digite um valor inteiro: ");
            int valor = input.nextInt();
            soma += valor;
        }
        
        if (soma == 21) {
            System.out.println("Venceu!");
        } else {
            System.out.println("Perdeu!");
        }
        
        input.close();
    }
}


