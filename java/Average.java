import java.util.Scanner;

public class Average{
	public static void main(String args[]){
		Scanner myGbenga = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int first = myGbenga.nextInt();
		System.out.print("Enter the second number: ");
		int second = myGbenga.nextInt();
		System.out.print("Enter the third number: ");
		int third = myGbenga.nextInt();
		System.out.print("Enter the fourth number: ");
		int fourth = myGbenga.nextInt();
		System.out.print("Enter the fifth number: ");
		int fifth = myGbenga.nextInt();
		int average = (first + second + third + fourth + fifth)/5;
		System.out.printf("The answer is: %d", average);
	}
}


