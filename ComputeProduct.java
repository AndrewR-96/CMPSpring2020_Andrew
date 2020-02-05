/**
 * 
 * @author Andrew
 * @created 2/05/20
 * @descrption This program will compute three numbers entered by the user
 *
 */
import java.util.Scanner;

public class ComputeProduct {
	public static void main(String[] args) {
		System.out.println("Enter 3 numbers separated By Spaces");
		Scanner keyboard = new Scanner(System.in);
		String[] numbers = new String[3];
		numbers[0]= keyboard.next();
		numbers[1]= keyboard.next();
		numbers[2]= keyboard.next();
		keyboard.close();
		int total=0;
		for (int i = 0; i < numbers.length; i++) {
			total = total + Integer.parseInt( numbers[i]); 
			
		}
		System.out.println(total);
	

	}
	}