import java.util.Scanner;

public class Circumference{
	public double calulateCircumference(){
	System.out.println("Enter any radius to calculate the circumference");
	Scanner sc = new Scanner(System.in);
	double radius = sc.nextDouble();
	double circum = 2 * radius * Math.PI;
    return circum; 
 }
}