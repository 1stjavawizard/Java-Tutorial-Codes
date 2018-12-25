import java.util.Scanner; // this tells the jvm to load Scanner class

public class Addition{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);// this is an object telling the user to type from keyboard
		System.out.println("enter your first name "); // your telling the use what to do
	  String first = sc.nextLine();
	  System.out.println("enter your last name "); // your telling the use what to do
	  String second = sc.nextLine();
	  String sum = first + second;
	  System.out.printf("Your first name is :\n %s\nt your last name is:\n %s\nt Your full name is %s",first,second,sum); // your telling the use what to do
	  
	}
}
