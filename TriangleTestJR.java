import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTestJR {
	Triangle t;

	@Test
	public void testScaleneA() {
		t = new Triangle(2, 3, 4);
		assertEquals(t.describe(), "Scalene");
	}
	
	@Test
	public void testFail() {
		fail("This test will fail!");
	}

}
