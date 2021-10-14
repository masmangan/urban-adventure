package hello;

public class Circulo {

	private double radius;

	public Circulo(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14159 * radius * radius;
	}

	public static void main(String[] args) {
		System.out.println("Circulo!");
	}
}
