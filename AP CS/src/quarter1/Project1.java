package quarter1;
/*Richard Paul
* Project 1
* September 10, 2016
* Will print shapes with asterisks. 
*/
public class Project1 {
	public static void main(String[] args) {
		//string command, with 'a' being the first, and 'd' being the last
		String a = "square";
		String b = "circle";
		String c = "arrow";
		String d = "diamond";
		String[] circle = { "   ***   ", " *     * ", "*       *", "*       *", "*       *", "*       *", "*       *", " *     * ", "   ***   "};
		String[] square = { "*********", "*       *", "*       *", "*       *", "*       *", "*       *", "*       *", "*       *", "*********"};
		String[] arrow = { "  *  ", " *** ", "*****", "  *  ", "  *  ", "  *  ", "  *  ", "  *  ", "  *  " };
		String[] diamond = {"    *    ", "   * *   ", "  *   *  ", " *     * ", "*       *", " *     * ", "  *   *  ", "   * *   ", "    *    "};
		String[] test1 = new String[9];
		String[] test2 = new String[9];
		String[] test3 = new String[9];
		String[] test4 = new String[9];
		a.toLowerCase();
		b.toLowerCase();
		c.toLowerCase();
		d.toLowerCase();
		if (a == "circle") {
			System.arraycopy(circle, 0, test1, 0, circle.length);
		} else if (a == "square") {
			System.arraycopy(square, 0, test1, 0, square.length);
		} else if (a == "diamond") {
			System.arraycopy(diamond, 0, test1, 0, diamond.length);
		} else if (a == "arrow") {
			System.arraycopy(arrow, 0, test1, 0, arrow.length);
		}
		if (b == "circle") {
			System.arraycopy(circle, 0, test2, 0, circle.length);
		} else if (b == "square") {
			System.arraycopy(square, 0, test2, 0, square.length);
		} else if (b == "arrow") {
			System.arraycopy(arrow, 0, test2, 0, arrow.length);
		} else if (b == "diamond") {
			System.arraycopy(diamond, 0, test2, 0, diamond.length);
		}
		if (c == "circle") {
			System.arraycopy(circle, 0, test3, 0, circle.length);
		} else if (c == "square") {
			System.arraycopy(square, 0, test3, 0, square.length);
		} else if (c == "arrow") {
			System.arraycopy(arrow, 0, test3, 0, arrow.length);
		} else if (c == "diamond") {
			System.arraycopy(diamond, 0, test3, 0, diamond.length);
		}
		if (d == "circle") {
			System.arraycopy(circle, 0, test4, 0, circle.length);
		} else if (d == "square") {
			System.arraycopy(square, 0, test4, 0, square.length);
		} else if (d == "arrow") {
			System.arraycopy(arrow, 0, test4, 0, arrow.length);
		} else if (d == "diamond") {
			System.arraycopy(diamond, 0, test4, 0, diamond.length);
		}
		System.out.println(test1[0] + "  " + test2[0] + "  " + test3[0] + "  " + test4[0]);
		System.out.println(test1[1] + "  " + test2[1] + "  " + test3[1] + "  " + test4[1]);
		System.out.println(test1[2] + "  " + test2[2] + "  " + test3[2] + "  " + test4[2]);
		System.out.println(test1[3] + "  " + test2[3] + "  " + test3[3] + "  " + test4[3]);
		System.out.println(test1[4] + "  " + test2[4] + "  " + test3[4] + "  " + test4[4]);
		System.out.println(test1[5] + "  " + test2[5] + "  " + test3[5] + "  " + test4[5]);
		System.out.println(test1[6] + "  " + test2[6] + "  " + test3[6] + "  " + test4[6]);
		System.out.println(test1[7] + "  " + test2[7] + "  " + test3[7] + "  " + test4[7]);
		System.out.println(test1[8] + "  " + test2[8] + "  " + test3[8] + "  " + test4[8]);
	}
}
