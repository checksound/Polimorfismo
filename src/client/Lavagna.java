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
		Shape sp = new Shape();
		shapeController.printShape(sp);
	}
	
	void disegnaCircle() {
		System.out.println("Lavagna: chiamo disegna Circle");
		Shape sp = new Circle(); 
		shapeController.printShape(sp);
	}
	
	void disegnaTriangle() {
		System.out.println("Lavagna: chiamo disegna Triangle");
		Shape sp = new Triangle();
		shapeController.printShape(sp);
	}
	
	void disegnaSquare() {
		System.out.println("Lavagna: chiamo disegna Square");
		Shape sp = new Square();
		shapeController.printShape(sp);
	}

	public static void main(String[] args) {
		Lavagna lavagna = new Lavagna();
		
		lavagna.disegnaShape();
		
		lavagna.disegnaCircle();
		
		lavagna.disegnaTriangle();
		
		lavagna.disegnaSquare();
		
	}

}
