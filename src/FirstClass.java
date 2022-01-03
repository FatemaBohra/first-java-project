import java.util.Scanner;

/**
 * My First Java Class
 * @author fatemabohra
 *
 */
public class FirstClass {
	
	/**
	 * This is the main method, the entry to any Java Program.
	 * @param args
	 */

	public static void main(String[] args) {		
		System.out.println("Hello, World!");
		System.out.println();
		
		/*
		 * defining variables
		 */
		
		int x = 5;
		
		double y = 5.0;
		
		boolean flag = true;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("flag : " + flag);
		
		/*
		 * Strings and characters
		 */
		
		String dept = "cit";
		char letter = 'a';
		
		String course = dept + 590;
		String grade = letter + " ";
		
		String courseInformation = course + ": " + grade;
		System.out.println(courseInformation);
		
		/*
		 * Math operators
		 */
		
		double d = 2 * x + 5;
		double z = 2 * y + 10;
		
		System.out.println();
		System.out.println("d: " + d);
		System.out.println("z: " + z);
		
		/*
		 * User input
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Enter a number: ");
		int myInt = scan.nextInt(); //get next input as int
		System.out.println("Your number is: " + myInt);
		
		//print the multiplication table up to 10 for myInt
		for (int m = 1; m < 11; m++) {
			//print m * myInt
			System.out.println(myInt + " x " + m + " = " + (myInt * m));
		}
		
		scan.close();

	}

}
