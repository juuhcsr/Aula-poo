package Circulo;

public class Circle_3 {
	// Declarando variáveis
	
		private int diameter;
		private int xPosition;
		private int yPosition;
		
		// Construtores da função 
		
		public Circle_3(int diameter, int xPosition, int yPosition) {
			super();
			this.diameter = diameter;
			this.xPosition = xPosition;
			this.yPosition = yPosition;
		}
		// Escreva métodos de acesso para os atributos diameter,
		// xPosition e yPosition da classe Circle.
		
		public int getDiameter() {
			return diameter;
		}
		public void setDiameter(int diameter) {
			this.diameter = diameter;
		}
		public int getxPosition() {
			return xPosition;
		}
		public void setxPosition(int xPosition) {
			this.xPosition = xPosition;
		}
		public int getyPosition() {
			return yPosition;
		}
		public void setyPosition(int yPosition) {
			this.yPosition = yPosition;
		}
		
		//B - Escreva um método que calcule e retorne o raio de 
		//uma instância da classe Circle. Raio = diameter12.
		
		
		public double getRadius() {
		    return diameter / 2.0;
		}

		//c) Para calcular e retornar a área e o perímetro 
		//de uma instância da classe Circle, adicione o 
		//seguinte método à classe Circle:

		public double getArea() {
		    double radius = getRadius();
		    return Math.PI * radius * radius;
		}

		public double getPerimeter() {
		    double radius = getRadius();
		    return 2 * Math.PI * radius;
		}

		
		
		
}
