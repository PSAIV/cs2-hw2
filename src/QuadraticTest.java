

import java.util.Scanner;


public class QuadraticTest {
	
	public static void main(String args[]) {
		
	Scanner s = new Scanner(System.in);
		
	System.out.print("Enter values for a, b, c: ");
	double a = s.nextDouble();
	double b = s.nextDouble();
	double c = s.nextDouble();
		
	s.close();
		
	QuadraticEquation quad = new QuadraticEquation(a, b, c);
		
	if(quad.getDiscriminant() > 0) {
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
