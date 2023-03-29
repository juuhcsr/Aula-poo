package ex9;

public class Divisores {
    public static void exibirDivisores(int num) {
        System.out.print("Os divisores de " + num + " são: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

