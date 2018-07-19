

import java.util.Random;


public class HW2_7_16 {
	
	public static void main(String args[]) {
		
		long startTime, endTime, executionTime;
		Random rand = new Random();
		int[] randArray = new int[100000];
		int key = rand.nextInt(100000) + 1;
		for(int i = 0; i < randArray.length; i++) {
			randArray[i] = rand.nextInt(100000) + 1;
		}
		
		//Obtain execution time for Linear Search function
		startTime = System.currentTimeMillis();
		System.out.println("Beginning linear search...");
		linearSearch(randArray, key);
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("Linear search complete. Time for linear search: " + executionTime);
		
		//Sort the array prior to beginning binary search
		System.out.println("\nSorting array...");
		selectionSort(randArray);
		System.out.println("Array sorted!");
		
		//Obtain execution time for Binary Search function
		startTime = System.currentTimeMillis();
		System.out.println("\nBeginning binary search...");
		binarySearch(randArray, key);
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("Binary search complete. Time for binary search: " + executionTime);
		
	}
	
	//Linear search function, as shown in Listing 7.6
	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i]) {
				return i;
			}
		}
		return -1;
	}
	
	//Implementation of selection sort, as shown in Listing 7.8
	public static void selectionSort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			int currentMin = list[i];
			int currentMinIndex = i;
			
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
	
	//Binary search function, as shown in Listing 7.7
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid]){
				high = mid - 1;
			}
			else if (key == list[mid]){
				return mid;
			}
			else {
				low = mid + 1;
			}
		}
		return -low - 1;
	}
}