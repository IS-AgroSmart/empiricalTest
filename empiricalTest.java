import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author José Escobar
 *
 */
public class empiricalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Triangle triangle = null;

		Scanner reader = new Scanner(System.in);

//		Step 1: Get Input
		boolean valid = false;
		do {
			System.out.println("Enter 3 integers which are sides of a triangle");
			try {
				System.out.print("a: ");
				a = reader.nextInt();
				System.out.print("b: ");
				b = reader.nextInt();
				System.out.print("c: ");
				c = reader.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Only numbers are allowed");
				reader.next(); // Clear invalid token from scanner
				continue; // Ask for values again
			}

			triangle = new Triangle(a, b, c);
			valid = triangle.sideRangeError() == null;
		} while (!valid);

		reader.close();

		System.out.println(triangle.describe());
	}

}