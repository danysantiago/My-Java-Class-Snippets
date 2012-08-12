package edu.uprm.ece.icom4015.shapes;

import java.util.Scanner;
import edu.uprm.ece.icom4015.shapes.io.Printable;
import edu.uprm.ece.icom4015.shapes.io.Readable;

public class ShapesMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean done = false;
		while (!done){
			Shape theShape = null;
			System.out.println("Enter a shape name or Q to exit:");
			String resp = in.nextLine();
			if (resp.equalsIgnoreCase("Q")){
				done = true;
			}
			else {
				theShape = ShapeFactory.newInstance(resp);
				if (theShape == null){
					System.out.println("Wrong shape type");
				}
				else {
					((Readable) theShape).read(in);
					((Printable) theShape).print(System.out);
					System.out.println();
					System.out.println("Perimeter: " + theShape.perimeter());
					System.out.println("Area: " + theShape.area());
					in.nextLine();
				}
			}
		}
	}

}
