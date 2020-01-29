import java.util.Scanner;

/**
 * 
 * @author Andrew
 * create: 1.29.20
 * description : This program calculates the Birth Year 
 *
 **/
/*
 *  multi-line comments
 */
// single-line comment

public class FirstProgram {
	// This is the first method the JVM looks for, in order to run
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to My First" + 
	"Program /nThis program calculates" + "the birth year");
		System.out.print("Enter your age:");
		int age = keyboard.nextInt();
		
		int birthYear= 2020-age;
		System.out.println(birthYear);
		System.out.println("your are most likely" + "to be born in" +
		birthYear);
	}

}
