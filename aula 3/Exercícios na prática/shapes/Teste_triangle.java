package shapes;
import Circulo.Triangle;
public class Teste_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle pessoa = new Triangle(10, 5, 7, 3);

		System.out.println("Altura: " + pessoa.getHeight());
		System.out.println("Largura: " + pessoa.getWidth());
		System.out.println("xPosition: " + pessoa.getxPosition());
		System.out.println("yPosition: " + pessoa.getyPosition());
		System.out.println("àrea do triangulo: " + pessoa.getArea());
	

	}
	
	
	

}
