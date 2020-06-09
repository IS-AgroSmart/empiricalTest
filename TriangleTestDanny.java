import static org.junit.Assert.*;
import org.junit.Test;
	
public class TriangleTestDanny {
	Triangle t;

	@Test
	public void testScaleneA() {
		t = new Triangle(3, 4, 5);
		assertEquals(t.describe(), "Scalene");
	}

	@Test
	public void testEquilateral() {
		t = new Triangle(1,1,1);
		assertEquals(t.describe(), "Equilateral");
	}
	
	@Test
	public void testValueBad() {
		t = new Triangle(0,0,0);
		assertEquals(t.describe(), "Value of a is not in the range of permitted values");
	}
}
