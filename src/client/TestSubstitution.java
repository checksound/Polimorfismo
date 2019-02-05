package client;

import polymorphysm.shape.Circle;
import polymorphysm.shape.Shape;
import polymorphysm.shape.Square;
import polymorphysm.shape.Triangle;

public class TestSubstitution {

	public static void main(String[] args) {
		Shape sp = new Circle();
		
		// sfrutta polimorfismo
		sp.draw();
		
		sp = new Triangle();
		
		Triangle myTriangle = (Triangle) sp; // OK ESPLICIT CAST
		System.out.println("dopo cast Triangle - 1");
		myTriangle.draw();
		
		try {
			// tento di fare assegnamento di un oggetto di tipo Shape 
			// a un oggetto di tipo Square
			Square mySquare = (Square) sp; // nesessario cast esplicito
						
			System.out.println("dopo cast Square - 2");
		} catch(ClassCastException e) {
			System.out.println("Catturate eccezione: " + e);
		}
		
		System.out.println("FINE METODO");

	}

}
