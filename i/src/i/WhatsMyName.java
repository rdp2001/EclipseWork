package i;

import java.util.Scanner;

/*Richard Paul
 * 9/14
 * Prints your Name.
 */
public class WhatsMyName {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.print("What is your first name? ");
		String fname = name.next();
		System.out.print("What is your last name? ");
		String lname = name.next();
		System.out.print("Your full name is "+fname+" "+lname+".");
		name.close();
	}

}