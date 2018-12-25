import javax.swing.JOptionPane;
public class CompoundInterest{
	public static double getCompundInterest(double principal,double rate,int no,double years){
		double Amount = principal * Math.pow((1 + rate / no),no * years);
		return Amount;
	}
	
	public static void main(String[] args){
		String prince = JOptionPane.showInputDialog("Enter your principal here");
		double principal = Double.parseDouble(prince);
				String rat = JOptionPane.showInputDialog("Enter your rate without %");
		double rate = Double.parseDouble(rat);
				String nos = JOptionPane.showInputDialog("Enter the number of times invested per year");
		int no = Integer.parseInt(nos);
		String yrs = JOptionPane.showInputDialog("Enter the number of years invested");
		double years = Double.parseDouble(yrs);
		double interest = getCompundInterest(principal,rate,no,years);
		String message = String.format("Your principal is: %.2f\n Your rate is: %.2f\n Your number times invested per year is: %d\n :Your number years invested is: %.2f\n Your Compound Interest is: %d",principal,rate,no,years,Math.round(interest));
		JOptionPane.showMessageDialog(null,message);
	}
}