

import java.util.Scanner;


public class HW2_7_32 {

	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter list: ");
		//Captures the first integer as the length of the list
		int arrayLength = s.nextInt();
		int[] pivotList = new int[arrayLength];
		
		for(int i = 0; i < pivotList.length; i++) {
			pivotList[i] = s.nextInt();
		}
		
		s.close();
		int pivotIndex = partition(pivotList);
		
		/* With the pivot placed at the proper index, check for first instance of an element
		 * greater than the pivot before the pivot's index. If one is found, find first instance of
		 * an element after the pivot that is less than the pivot. Swap these two values. Repeat until the pivot is reached.
		 */
		for(int i = 0; i < pivotIndex; i++){
			if(pivotList[i] > pivotList[pivotIndex]) {
				for(int j = pivotIndex + 1; j < pivotList.length; j++){
					if(pivotList[j] < pivotList[pivotIndex]){
						int temp = pivotList[i];
						pivotList[i] = pivotList[j];
						pivotList[j] = temp;
						break;
					}
				}
			}
		}
		
		System.out.print("After the partition, the list is ");
		
		for(int i = 0; i < pivotList.length; i++) {
			System.out.print(pivotList[i] + " ");
		}
		
	}
	//Finds the pivot's proper index and moves it there int the array, then returns the index.
	public static int partition(int[] list) {
		int pivot = list[0];
		int count = 0;
		
		for(int i = 0; i < list.length; i++) {
			if(list[i] < pivot) {
				count++;
			}
		}
		list[0] = list[count];
		list[count] = pivot;
		
		return count;
	}
}