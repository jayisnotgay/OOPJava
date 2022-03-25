import java.util.Scanner;
import java.util.Arrays;

public class printArrayInStars {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int NUM_ITEMS;
		// Input for number of items
		System.out.println("Number of items in array: ");
		NUM_ITEMS = input.nextInt();
		// Initializing array
		int items[] = new int [NUM_ITEMS];
		// Input for the values of items
		System.out.println("Enter the value of items (separated by space): ");
		
		for(int i=0;i<NUM_ITEMS;i++) {
			items[i] = input.nextInt();
		}
		// Output
		for(int i=0;i<NUM_ITEMS;i++) {
			System.out.print(( i +": "));
			// Printing stars
			System.out.print(("*".repeat(items[i])));
			System.out.print("("+ items[i] +")");
			System.out.println();
			System.out.println();
			
		input.close();
		}
	}

}
