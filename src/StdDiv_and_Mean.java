//Finds the standard deviation and mean of a given array of length 10.
import java.util.Scanner;

public class StdDiv_and_Mean {

	public static void main(String args[]) {
		
		double[] stdDivArr = new double[10];
		double mean;
		double deviation;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		
		for(int i = 0; i < 10; i++) {
			stdDivArr[i] = s.nextDouble();
		}
		
		s.close();
		
		mean = mean(stdDivArr);
		System.out.printf("The mean is %.2f\n", mean);
		deviation = deviation(stdDivArr);
		System.out.printf("The standard deviation is %.5f", deviation);
		
	}
	
	//Computes the standard deviation using the formula provided in the assignment
	public static double deviation(double[] x) {
		
		//Retrieves the mean from the function below
		double mean = mean(x);
		double result = 0;
		for(int i = 0; i < x.length; i++) {
			x[i] = Math.pow((x[i] - mean), 2);
			result += x[i];
		}
		
		result /= (x.length -1);
		result = Math.pow(result, 0.5);
		return result;
	}
	
	//Computes the mean of the array by summing all numbers and dividing by by the array's length
	public static double mean(double[] x) {
		
		double result = 0;
		for(int i = 0; i < x.length; i++) {
			result += x[i];
		}
		result /= x.length;
		return result;
		
	}
}
