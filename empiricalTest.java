import java.util.Scanner;

/**
 * @author José Escobar
 *
 */
public class empiricalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Triangle triangle;

		Scanner reader = new Scanner(System.in);

//		Step 1: Get Input
		do {
			System.out.println("Enter 3 integers which are sides of a triangle");
			System.out.print("a: ");
			a = reader.nextInt();
			System.out.print("b: ");
			b = reader.nextInt();
			System.out.print("c: ");
			c = reader.nextInt();

			triangle = new Triangle(a, b, c);
		} while (triangle.sideRangeError() != null);

		reader.close();

		System.out.println(triangle.describe());
	}

}