
public class Polygon {
	private Point[] thePoints;
	
	public Polygon(int numPoints){
		assert(numPoints > 2);
		this.thePoints = new Point[numPoints];
	}
	
	public int getNumberOfPoint(){
		return this.thePoints.length;
	}
	
	public void setPoint(int index, Point P){
		assert(index >=0 && index < this.thePoints.length);
		assert(P!=null);
		this.thePoints[index] = P;
	}
	
	public Point getPoint(int index){
		assert(index >=0 && index < this.thePoints.length);
		return this.thePoints[index];
	}
	
	public String toString(){
		String result = "[";
		for (Point P : this.thePoints){
			result = result + P.toString() + " ";
		}
		result = result.trim();
		result = result  + "]";
		return result;
	}
	
	public double perimeter(){
		double result = 0.0;
		for (int i=0; i <this.thePoints.length; ++i){
			if (i == this.thePoints.length -1){
				result += this.thePoints[i].distanceToPoint(this.thePoints[0]);
			}
			else {
				result += this.thePoints[i].distanceToPoint(this.thePoints[i+1]);
			}
		}
		return result;
	}
}
