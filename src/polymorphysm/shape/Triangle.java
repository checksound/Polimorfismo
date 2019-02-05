package polymorphysm.shape;

public class Triangle extends Shape {
	
	public void erase() {
		System.out.println("ERASE TRIANGLE");
	}
	
	@Override
	public void draw() {
		System.out.println("DRAW TRIANGLE:");
		System.out.println(" /\\");
		System.out.println("/  \\");
		System.out.println("----");
	}
	
	
}
