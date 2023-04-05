package Circulo;

public class Triangle {
 
		private int height;
		private int width;
		private int xPosition;
		private int yPosition;
		public Triangle(int height, int width, int xPosition, int yPosition) {
			super();
			this.height = height;
			this.width = width;
			this.xPosition = xPosition;
			this.yPosition = yPosition;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public int getWidth() {
			return width;
		}
		public void setWidth(int width) {
			this.width = width;
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
		
		public int getArea() {
		    return (height * width)/2;
		}
	
	
	
}
