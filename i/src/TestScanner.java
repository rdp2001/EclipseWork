import java.util.*;
import java.io.*;
public class TestScanner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 Integers: ");
		int num1 = input.nextInt(), num2 = input.nextInt(), num3 = input.nextInt();
		System.out.println("The average of "+num1+", "+num2+", and "+num3+" is "+(num1+num2+num3)/3.0);
		input.close();
	}

}
