import java.util.Scanner;

public class no13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Input
        System.out.println("ax^2 + bx + c");
        System.out.println("a: ");
        double a = input.nextDouble();

        System.out.println("b: ");
        double b = input.nextDouble();

        System.out.println("c: ");
        double c = input.nextDouble();

        // Solving X with the equation
        double x1 = (-b + (Math.sqrt(Math.pow(b, b) - 4*a*c))/2*a);
        double x2 = (-b - (Math.sqrt(Math.pow(b, b) - 4*a*c))/2*a);

        // Output
        System.out.println("solution for the quadratic equation is : " + x1 + " and " + x2);
        
        input.close();
	}

}
