
public class Circle {
	public static final double PI = 3.1416;
	
	private double radius;
	
	public Circle(){
		this.radius = 1;
	}
	
	public Circle(double radius){
		this.radius = radius;
	}

	public double getRadius(){
		return this.radius;
	}
	
	public double diameter(){
		return 2 * this.radius;
	}
	
	public double circumference(){
		return 2 * this.radius * PI;
	}
	
	public double area(){
		return this.radius * this.radius * PI;
	}
	
	public String toString(){
		return "C<" + this.radius + ">";
	}
	
	public boolean equals(Circle C){
		return this.radius == C.radius;
	}
	
	
	
	
	
}
