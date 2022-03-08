import java.util.Scanner;

public class no11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
// Inputting X and Y	
        System.out.println("x = ");
        int x = input.nextInt();
        
        System.out.println("y = ");
        int y = input.nextInt();
// Swapping variables
        int temp = x;
        x = y;
        y = temp;
 // Output
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        input.close();
	}

}
