import java.util.Scanner;

public class Diameter{
	public double calulateDiameter(){
		System.out.println("Enter any radius to calculate the diameter");
	Scanner sc = new Scanner(System.in);
	double radius = sc.nextDouble();
	double diameter = 2 * radius;
    return diameter; 
 }
}