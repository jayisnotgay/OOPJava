
public class no12 {

	public static void main(String[] args) {
		// Prints the header
		System.out.println("numbers   square   cube");
		
		// For loop (prints numbers from 0 to 10, with squared and cubed
		for (int i = 0; i<=10; i++){
            System.out.println("   " + i + "        "  + (int)Math.pow(i,2) + "        " + (int)Math.pow(i,3));
		}
	}

}
