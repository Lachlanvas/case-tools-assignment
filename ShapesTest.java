import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShapesTest {

Shapes sha;
	
	@BeforeEach
	public void setup() {
		sha = new Shapes();
		System.out.println("I am BeforeEach");
	}
		
	
	@Test
	void testFindArea() {
		System.out.println("I am Test Area");
		double actual = sha.findArea(3, 3);
		double expected = 9;
		assertEquals(expected, actual);
	}

	@Test
	void testFindPerimeter() {
		System.out.println("I am Test Perimeter");
		double actual = sha.findPerimeter(2, 3);
		double expected = 10;
		assertEquals(expected, actual);
		
	}
	

	@Test
	void testFindAreaCircle() {
		System.out.println("I am Test Area of circle");
		double actual = sha.findAreaCircle(2);
		double expected = 12.56;
		assertEquals(expected, actual);
	}

	@Test
	void testFindPerimeterCircle() {
		System.out.println("I am Test Perimeter of circle");
		double actual = sha.findPerimeterCircle(2);
		double expected = 12.56;
		assertEquals(expected, actual);
	}
	@AfterEach
	public void tearDown() {
		System.out.println("I am AfterEach");
		sha = null;
	}

}
