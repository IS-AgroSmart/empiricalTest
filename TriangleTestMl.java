package empiricalTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class TriangleTestMl {

	Triangle t;

	@Test
	public void testValueA() {
		t = new Triangle(300, 1, 1);
		assertEquals(t.describe(),  "Value of a is not in the range of permitted values");
	}
	
	@Test
	public void testValueB() {
		t = new Triangle(1, 300, 1);
		assertEquals(t.describe(),  "Not a Triangle");
	}
	
	@Test
	public void testValueB2() {
		t = new Triangle(5, -1, 6);
		assertEquals(t.describe(),  "Not a Triangle");
	}

}
