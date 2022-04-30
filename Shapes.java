
public class Shapes {
	private double length;
	private double breadth;
	private double area;
	private double perimeter;
	
	public Shapes() {
		this.length=0.0;
		this.breadth=0.0;
		this.area=0.0;
		this.perimeter=0.0;
	}
	
	public double findArea(double length, double breadth) {
		area = length * breadth;
		return area;
	}
	
	public double findPerimeter(double length, double breath) {
		perimeter = 2*(length + breath);
		return perimeter;
	}
	
}
