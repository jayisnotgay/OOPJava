import java.util.Scanner; //Imports scanner class
public class no9 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
	    
	    System.out.println("Enter temprature in Celcius:"); // Writing input
	    
	    float celcius = input.nextFloat(); //Accepting input
	    float fahrenheit = ((celcius*9/5)+32); //Conversion formula
	        
	    System.out.println(celcius + " celcius degrees are "+ fahrenheit + " fahrenheit degrees"); //Output
	    
	    input.close();
	}
}
