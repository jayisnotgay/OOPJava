import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;

public class PrintArrayGrades {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numStudents;
		double sum = 0;
		double average;
		// Input for number of students
		System.out.println("Number of students: ");
		numStudents = input.nextInt();
		// Initializing grades array
		int grades[] = new int [numStudents];
		// For loop student grades input
		for(int i=0;i<numStudents;i++) {
			System.out.println("Enter the grade for student " + (i+1) + ": ");
			grades[i] = input.nextInt();
		}
		// For loop sum of student grades
		for(int i=0;i<numStudents;i++) {
			sum += grades[i];
		}
		// Sorting student grades to find out minimum and maximum
		int gradesSorted[] = grades;
		Arrays.sort(gradesSorted);
		// Calculating average sum of students
		average = sum/numStudents;
		// Formatting decimals for average variable
		NumberFormat formatter = new DecimalFormat("#0.00");     
		// Outputs (average, minimum, maximum)
		System.out.println(formatter.format(average));
		System.out.println(gradesSorted[0]);
		System.out.println(gradesSorted[gradesSorted.length-1]);
		 
		input.close();
	}

}
