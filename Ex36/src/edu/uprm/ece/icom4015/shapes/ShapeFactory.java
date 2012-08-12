package edu.uprm.ece.icom4015.shapes;

public class ShapeFactory {

	public static Shape newInstance(String type) {
		if (type.equalsIgnoreCase("Point")){
			return new Point();
		}
		else if (type.equalsIgnoreCase("Line")){
			return new Line();
		}
		else if (type.equalsIgnoreCase("Rect")){
			return new Rectangle();
		}
		else {
			return null;
		}
	}
	

}
