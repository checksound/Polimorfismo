package client;

import shape.Circle;
import shape.Shape;
import shape.ShapeController;
import shape.Square;
import shape.Triangle;

public class Lavagna {
	
	private ShapeController shapeController = new ShapeController();
		
	void disegnaShape() {
		System.out.println("Lavagna: chiamo disegna Shape");
		shapeController.printShape(new Shape());
	}
	
	void disegnaCircle() {
		System.out.println("Lavagna: chiamo disegna Circle");
		shapeController.printShape(new Circle());
	}
	
	void disegnaTriangle() {
		System.out.println("Lavagna: chiamo disegna Triangle");
		shapeController.printShape(new Triangle());
	}
	
	void disegnaSquare() {
		System.out.println("Lavagna: chiamo disegna Square");
		shapeController.printShape(new Square());
	}

	public static void main(String[] args) {
		Lavagna lavagna = new Lavagna();
		
		lavagna.disegnaShape();
		
		lavagna.disegnaCircle();
		
		lavagna.disegnaTriangle();
		
		lavagna.disegnaSquare();
		
	}

}
