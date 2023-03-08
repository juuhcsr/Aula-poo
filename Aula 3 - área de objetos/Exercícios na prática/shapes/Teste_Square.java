package shapes;
import Circulo.Square;
import Circulo.Triangle;


public class Teste_Square {
	public static void main(String[] args) {
		
		Square quadrado = new Square(10, 5, 7);
		
		System.out.println("Lado: " + quadrado.getSize());
		System.out.println("xPosition: " + quadrado.getxPosition());
		System.out.println("yPosition: " + quadrado.getyPosition());
		System.out.println("Aŕea: " + quadrado.getArea());
		System.out.println("Perímetro: " + quadrado.getPerimeter());
		
	}
}
