import java.util.Scanner;

public class no14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Input total seconds
		
		System.out.println("Number of seconds: ");
		double second = input.nextDouble();
		
		// Calculating hours, minutes, and seconds
		
		double hour = Math.floor(second/3600);
		double minute = Math.floor((second - (hour*3600))/60);
		double seconds = (second - (hour*3600) - (minute*60));
		
		//Output
		
		System.out.println(hour + " hours " + minute + " minutes " + seconds + " seconds ");

		input.close();
	}

}
