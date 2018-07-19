//Removes duplicates from a given array of size 10.
import java.util.Scanner;


public class RemoveDupes {

	public static void main(String args[]) {
		
		int[] dupeArray = new int[10];
		Scanner s = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		
		for(int i = 0; i < dupeArray.length; i++) {
			dupeArray[i] = s.nextInt();
		}
		s.close();
		
		int[] result = new int[10];
		result = eliminateDuplicates(dupeArray);
		
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		
		
	}
	
	//Checks for duplicates, then pushes all unique digits into a new array of length k.
	public static int[] eliminateDuplicates(int[] list) {
		int[] noDupes = new int[10];
		int k = 0;
		
		//Checks the entire original array for a duplicate, if there is none, push onto the new array
		for (int i = 0; i < 10; i++) {
			boolean unique = true;
			for (int j = 0; j < 10; j++) {
				if (list[i] == noDupes[j]){
					unique = false;
				}
			}
			
			//k will increment up if a unique number is found
			if(unique){
				noDupes[k] = list[i];
				k++;
			}
		}
		
		//Creates a final new array, only as long as the number of unique digits
		int[] result = new int[k];
		for (int i = 0; i < result.length; i++){
			result[i] = noDupes[i];
		}
		
		return result;
	}
}
