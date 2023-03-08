package Circulo;

public class Square {

	private int size;
	private int xPosition;
	private int yPosition;
	public Square(int size, int xPosition, int yPosition) {
		super();
		this.size = size;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
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
	    return size * size;
	}
	
	public int getPerimeter() {
	    return 4 * size;
	}

	
	
}
