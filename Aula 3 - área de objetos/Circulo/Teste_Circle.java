package shapes;
import Circulo.Circle_3;

public class Teste_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Criando um objeto Circle
		Circle_3 circle = new Circle_3(10, 5, 7);
	    
	    // Testando os métodos de acesso
	    System.out.println("Diameter: " + circle.getDiameter());
	    System.out.println("xPosition: " + circle.getxPosition());
	    System.out.println("yPosition: " + circle.getyPosition());
	    
	    // Testando o método getRadius
	    System.out.println("Radius: " + circle.getRadius());
		
	    // Testando o método getAreaAndPerimeter
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perímetro: " + circle.getPerimeter());
      
	    
	    
	}

}
