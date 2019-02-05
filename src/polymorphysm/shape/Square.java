package polymorphysm.shape;

public class Square extends Shape {
	
	public void erase() {
		System.out.println("ERASE SQUARE");
	}
	
	@Override
	public void draw() {
		System.out.println("DRAW SQUARE:");
		System.out.println("|---|");
		System.out.println("|   |");
		System.out.println("|---|");
	}
	
}
