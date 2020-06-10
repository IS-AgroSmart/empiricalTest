import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTestAG {
	Triangle t;
	
	@Test
	public void testScalene4() {
		t = new Triangle(1, 2, 2);
		assertEquals(t.describe(), "Isosceles");
	}
	
	@Test
	public void testScalene7() {
		t = new Triangle(0, 1, 1);
		assertEquals(t.describe(), "Value of a is not in the range of permitted values");
	}
	
	@Test
	public void testScalene12() {
		t = new Triangle(7, 14, 7);
		assertEquals(t.describe(), "Not a Triangle");
	}
	
}
