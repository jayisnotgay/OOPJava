import java.util.Scanner;

public class no10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("X1:"); // Input
        float x1 = input.nextFloat();
        System.out.println("X2:"); 
        float x2 = input.nextFloat();
        System.out.println("X3:");
        float x3 = input.nextFloat();

        double mean = ((x1+x2+x3)/3); //Mean formula

        double variance = ((Math.pow(x1-mean, 2)) + (Math.pow(x2-mean, 2)) + (Math.pow(x3-mean, 2)))/3; //Variance formula

        double deviation = Math.sqrt(variance); //Deviation formula

        System.out.println("Mean value: " + mean); //Output
        System.out.println("Variance: " + variance);
        System.out.println("Standard deviance: " + deviation);

        input.close();
	}

}
