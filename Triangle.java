
public class Triangle {
	int a, b, c;

	public Triangle(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public String sideRangeError() {
		if ((a < 1) || (a > 200))
			return "Value of a is not in the range of permitted values";
		if ((b < 1) && (b > 200))
			return "Value of a is not in the range of permitted values";
		if ((c < 1) && (c > 200))
			return "Value of c is not in the range of permitted values";
		return null;
	}

	private boolean isTriangle() {
		return (a < b + c) && (b < a + c) && (c < a + b);
	}

	private String getTriangleType() {
		if (!this.isTriangle())
			return "Not a Triangle";
		if ((a == b) && (b == c))
			return "Equilateral";
		else if ((a != b) && (a != c) && (b != c))
			return "Scalene";
		else
			return "Isosceles";
	}

	public String describe() {
		String range = this.sideRangeError();
		if (range != null)
			return range;
		return this.getTriangleType();
	}

	public String describe(int a,int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
		return this.describe();
	}
}
