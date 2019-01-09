package shape;

public class Lavagna {
	
	private ShapeController shapeController = new ShapeController();
		
	void disegnaShape() {
		shapeController.printShape(new Shape());
	}
	
	void disegnaCircle() {
		shapeController.printShape(new Circle());
	}

	public static void main(String[] args) {
		Lavagna lavagna = new Lavagna();
		
		lavagna.disegnaShape();
		lavagna.disegnaCircle();
	}

}
