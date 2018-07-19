

import java.util.Scanner;


public class HW2_7_19 {

	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter list: ");
		int size = s.nextInt();
		int[] unsorted = new int[size];
		
		for (int i = 0; i < unsorted.length; i++) {
			unsorted[i] = s.nextInt();
		}
		
		s.close();
		
		if(!isSorted(unsorted)){
			System.out.println("The list is not sorted");
		}
		else {
			System.out.println("The list is already sorted");
		}
	}
	
	//Modification of selection sort. If a swap is deemed necessary, return false.
	public static boolean isSorted(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			int currentMin = list[i];
			
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					return false;
				}
			}
		}
		return true;
	}
}