import javax.swing.JOptionPane;
public class AverageUsingJOptionPane{
	public static void main(String[] args){
		//second way
/* 		String fi = JOptionPane.showInputDialog("Enter the first number");
		String si = JOptionPane.showInputDialog("Enter the second number");
		String ti = JOptionPane.showInputDialog("Enter the third number");
		String fo = JOptionPane.showInputDialog("Enter the fourth number");
		String fif = JOptionPane.showInputDialog("Enter the fifth number");
		int first = Integer.parseInt(fi);
		int second = Integer.parseInt(si);
		int third = Integer.parseInt(ti);
		int fourth = Integer.parseInt(fo);
		int fifth = Integer.parseInt(fif);
		
		int sum = first + second + third + fourth+ fifth;
		
		int average = sum/5;
		JOptionPane.showMessageDialog(null,"The average of the number is "+average,"The Answer",JOptionPane.INFORMATION_MESSAGE);
		 */
		
		// second method
		int total = 0;
		for(int i=1; i<=5;i++){
			total += Integer.parseInt(JOptionPane.showInputDialog("Enter three numbers to calculate the average accordingly"));
		}
		
		int average = total/5;
		JOptionPane.showMessageDialog(null,"The average is "+average,"Calculation of  average",JOptionPane.INFORMATION_MESSAGE);
	}
}