import java.util.Scanner;

public class HW2_9_10 {
	
	static class QuadraticEquation {
		
		private double a;
		private double b;
		private double c;
		
		QuadraticEquation(double a, double b, double c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
		
		public double getA() {
			return a;
		}
		
		public double getB() {
			return b;
		}
		
		public double getC() {
			return c;
		}
		
		public double getDiscriminant() {
			return Math.pow(b, 2) - 4*a*c;
		}
		
		public double getRoot1() {
			if(getDiscriminant() < 0) {
				return 0;
			}
			else {
				return (-b + Math.sqrt(Math.pow(b, 2.0) - (4 * a * c))) / ( 2 * a);
			}
		}
		
		public double getRoot2() {
			if(getDiscriminant() < 0) {
				return 0;
			}
			else {
				return (-b - Math.sqrt(Math.pow(b,  2.0) - (4 * a * c))) / (2 * a);
			}
		}
	}
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter values for a, b, c: ");
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		
		s.close();
		
		QuadraticEquation quad = new QuadraticEquation(a, b, c);
		
		if(quad.getDiscriminant() > 0){
			System.out.printf("The two roots are: %f and %f", quad.getRoot1(), quad.getRoot2());
		}
		
		else if (quad.getDiscriminant() == 0) {
			System.out.printf("The only root is: %f", quad.getRoot1());
		}
		
		else {
			System.out.print("The equation has no roots.");
		}
	}
}