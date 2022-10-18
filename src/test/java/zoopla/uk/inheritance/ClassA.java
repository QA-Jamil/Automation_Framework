package zoopla.uk.inheritance;
import java.util.Scanner;

public class ClassA {
	
	public static void main(String[] args) {
		getGpa();
		System.out.println("Your GPA is : "+ gpa);
	}
	static double gpa;
	public static double getGpa() {
		System.out.println("Input your GPA : ");
		Scanner input = new Scanner(System.in);
		gpa = input.nextDouble();
		//input.close();
		return(gpa);
		
		
		
	}
	
}
