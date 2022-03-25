import java.util.Scanner;
import java.util.Arrays;

public class PrintArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int NUM_ITEMS;
		// Input number of items
		System.out.println("Number of items in array: ");
		NUM_ITEMS = input.nextInt();
		// Initializing items array
		int items[] = new int [NUM_ITEMS];
		// Input value of items with for loop
		System.out.println("Enter the value of items (separated by space): ");
		
		for(int i=0;i<NUM_ITEMS;i++) {
			items[i] = input.nextInt();
		}
		// Output
		System.out.println("The values are: " + (Arrays.toString(items)));
		
		input.close();
	}

}
