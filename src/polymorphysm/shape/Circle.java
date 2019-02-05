package polymorphysm.shape;

public class Circle extends Shape {
	
	public void erase() {
		System.out.println("ERASE CIRCLE");
	}
	
	@Override
	public void draw() {
		System.out.println("DRAW CIRCLE:");
		System.out.println("  +");
		System.out.println(" +++ ");
		System.out.println("+++++");
		System.out.println(" +++ ");
		System.out.println("  +");
	}

}
