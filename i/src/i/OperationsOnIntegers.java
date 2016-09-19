package i;
/* Richard Paul
 * 9/16
 * Enter 2 numbers, then prints basic math operations. 
 */
import java.util.Scanner;

public class OperationsOnIntegers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Open Scanner
		System.out.print("Enter first integer: "); //Ask for input
		int num1 = sc.nextInt(); //take input
		System.out.print("Enter second integer: "); //Ask for second input
		int num2 = sc.nextInt(); //takes second input
		sc.close(); //closes scanner
		System.out.println("The sum is: "+(num1+num2)); //prints the sum
		System.out.println("The difference is: "+(num1-num2)); //prints the division
		System.out.println("The product is: "+(num1*num2)); //prints the product
		System.out.println("The quotient is: "+((double)num1/num2)); //prints the quotient
		
	}

}
