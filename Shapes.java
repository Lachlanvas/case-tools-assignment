
public class Shapes {
	private double length;
	private double breadth;
	private double area;
	private double perimeter;
	private double radius;
	private double circle_area;
	private double circle_perimeter;
	
	public Shapes() {
		this.length=0.0;
		this.breadth=0.0;
		this.area=0.0;
		this.perimeter=0.0;
		this.radius=0.0;
		this.circle_area=0.0;
		this.circle_perimeter=0.0;
	}
	
	public double findArea(double length, double breadth) {
		area = length * breadth;
		return area;
	}
	
	public double findPerimeter(double length, double breadth) {
		perimeter = 2*(length + breath);
		return perimeter;
	}
	
	//Code added by Jesus
	//pi=3.14
		public double findAreaCircle(double radius) {
			circle_area = 3.14 * radius * radius;    
			return circle_area;
		}
		
		public double findPerimeterCircle(double radius) {
			circle_perimeter = 2 * 3.14 * radius;
			return circle_perimeter;
		}
		
		public void displayShapes() {
			System.out.println("Area of Rectangle = "+area);
			System.out.println("Perimeter of Rectangle = "+perimeter);
			System.out.println("Area of Circle = "+circle_area);
			System.out.println("Perimeter of Circle = "+circle_perimeter);
		}
	
}
