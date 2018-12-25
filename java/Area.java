import java.util.Scanner;

public class Area{
	public double calulateArea(){
	System.out.println("Enter any radius to calculate the area");
	Scanner sc = new Scanner(System.in);
	double radius = sc.nextDouble();
	double area = Math.PI * Math.pow(radius,2);
    return area; 
 }
}