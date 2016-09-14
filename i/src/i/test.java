package i;
//Author: Richard Paul
//Date created: Sep 5, 2016
public class test {
	public static void main(String[] args) {
		String a ="circle";
		String b = "square";
		String[] circle = {" * ","* *"," * "};
		String[] square = {"***","* *","***"};
		String[] test = new String[3];
		String[] test2 = new String[3];
		System.arraycopy(circle, 0, test, 0, circle.length);
		a.toLowerCase();
		b.toLowerCase();
		if(a == "circle") {
			System.arraycopy(circle, 0, test, 0, circle.length);
		}else if(a == "square") {
			System.arraycopy(square, 0, test, 0, square.length);
		}else {System.out.println("error");}
		if(b == "circle") {
			System.arraycopy(circle, 0, test2, 0, circle.length);
		}else if(b == "square") {
			System.arraycopy(square, 0, test2, 0, square.length);
		}else {System.out.println("error");
		}
		
	}

}
