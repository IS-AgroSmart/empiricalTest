import static org.junit.Assert.*;

import org.junit.Test;

public class TestFernando {
	Triangle t;

	@Test
	public void testNaT1() {
		t = new Triangle(4, 1, 1);
		assertEquals(t.describe(), "Not a Triangle");
	}
	
	@Test
	public void testNaT2() {
		t = new Triangle(1, 3, 100);
		assertEquals(t.describe(), "Not a Triangle");
	}
	
	@Test
	public void testNiR() {
		t = new Triangle(5, 3, 321);
		assertEquals(t.describe(), "Value of c is not in the range of permitted values");
	}

}