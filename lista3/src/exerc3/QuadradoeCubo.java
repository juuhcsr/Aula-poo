package exerc3;


public class QuadradoeCubo {
    public static void main(String[] args) {
        System.out.println("Número\tQuadrado\tCubo");
        for(int i = 1; i <= 15; i++) {
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.println(i + "\t" + quadrado + "\t\t" + cubo);
        }
    }
}

	