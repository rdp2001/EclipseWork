package i;
/*Richard Paul
 * 9/9
 * Order of Operations/Arithmetic/Integers
 */
public class NumericVariables {

	public static void main(String[] args) {
		int num = 7;
		int num2 = 15;
		
		int total, difference, product, quotient, mod;
		total = num + num2;
		product = num*num2;
		difference = num-num2;
		quotient = num/num2;
		mod = num2%num;
		System.out.println("total = " + total);
		System.out.println("product = " + product);
		System.out.println("quotient = " + quotient);
		System.out.println("difference = " + difference);
		System.out.println("mod = " + mod);
		
	}

}
