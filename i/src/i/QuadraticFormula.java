package i;

import java.util.Scanner;

public class QuadraticFormula {

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter A: ");
			double a = sc.nextDouble();
			System.out.print("Enter B: ");
			double b = sc.nextDouble();
			System.out.print("Enter C: ");
			double c = sc.nextDouble();
			if ((b * b - 4 * a * c) < 0)
				System.out.println("No Real Solutions");
			else {
				System.out.println("The discriminant is: " + (Math.sqrt(b * b - 4 * a * c)));
				System.out.println("The roots are: " + (Math.sqrt(b * b - 4 * a * c) - b) / (2 * a) + " and "
						+ (-(Math.sqrt(b * b - 4 * a * c)) - b) / (2 * a) + "\n");

			}
		}
	}

}
