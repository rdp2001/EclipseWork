package i;
import java.util.*;
/*Richard Paul
 * 9/14
 * Gives the radius of a circle given the area
 */

public class Circles {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("What is the area? ");
		double area = a.nextDouble(), r = Math.sqrt(area / Math.PI);
		System.out.println("Radius of your circle is "+r+".");
		a.close();
	}

}