public class SquareRoot {

	public static void main(String[] args) {
		double a = 3;
		double b = 2.5;
		double c = -0.5;
		
		double dx = b*b - 4*a*c;
		//double dxRoot = Math.sqrt(dx);
		
		//System.out.println(dx);
		if(a == 0 && b == 0 && c == 0) {
			System.out.println("x1=");
			System.out.printf("x2=");
		}
		else if(a == 0 && c == 0) {
			double x1 = 0, x2 = 0;
			System.out.println("x1=" + x1);
			System.out.println("x2=" + x2);
		}
		else if(a == 0 && b == 0) {
			System.out.println("x1=");
			System.out.printf("x2=");
		}
		else if(dx > 0) {
			double x1 = (-b + Math.sqrt(dx))/(2*a);
			double x2 = (-b - Math.sqrt(dx))/(2*a);
			System.out.println("x1=" + x1);
			System.out.println("x2=" + x2);
		}
		else if(dx == 0) {
			double x1 = -b/(2*a), x2 = -b/(2*a);
			System.out.println("x1=" + x1);
			System.out.println("x2=" + x2);
		}
		else{
			double x1 = -b/(2*a), x2 = -b/(2*a);
			System.out.println("x1=" + x1);
			System.out.println("x2=" + x2);
		}
	}

}
