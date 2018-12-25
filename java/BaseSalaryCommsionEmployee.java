import javax.swing.JOptionPane;
public class BaseSalaryCommsionEmployee extends EmployeeInfo{
	private SalaryEmployee wage;
	private CommissionEmployee commssion;
	private double total;
	public  BaseSalaryCommsionEmployee(SalaryEmployee ho, CommissionEmployee k){
		wage = ho;// new SalaryEmployee(salary)
		commssion = k;
		//this.total = total;
	} 
 public SalaryEmployee getWage(){
	 return wage;
 }
 
 public CommissionEmployee getCommssion(){
	 return commssion;
 }
  public void setTotal(double meat){
	 total = meat;
 }
 public double getTotal(){
	 return total;
 } 
 
public double earnings(){
	 return getTotal();
	}
	
	public static void main(String args[]){
		
		String role = JOptionPane.showInputDialog("What is your job role");	
	if(role.equalsIgnoreCase("Salary Employee")){
		
		String firstName = JOptionPane.showInputDialog("Enter Your first name");
		String lastName = JOptionPane.showInputDialog("Enter Your Surname");
		int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Your identification number in digits only"));
	    int accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Account Number"));
		String address = JOptionPane.showInputDialog("Please enter your address here");
		double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter your workers salary here"));
		SalaryEmployee sal = new SalaryEmployee(salary);
		String message = String.format("First name is: %s\n Last name is: %s\n Identification Number is: %7d\n Your Account number is: %10d\n Worker House Address is: %s\n Workers Portfolio is: %s\n Your weekly salary is: N%.1f\n",firstName,lastName,id,accountNumber,address,role,sal.earnings());
		JOptionPane.showMessageDialog(null,message);
		}
		
	else if(role.equalsIgnoreCase("Employee paid by hours")){
			String firstName = JOptionPane.showInputDialog("Enter Your first name");
		String lastName = JOptionPane.showInputDialog("Enter Your Surname");
		int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Your identification number in digits only"));
	    int accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Account Number"));
		String address = JOptionPane.showInputDialog("Please enter your address here");
			double hours = Double.parseDouble(JOptionPane.showInputDialog("Enter hours worked"));
		double payment = Double.parseDouble(JOptionPane.showInputDialog("What is the money earned per hour?"));
			HourlyEmployee emp = new HourlyEmployee(hours,payment);
			String message = String.format("First name is: %s\n Last name is: %s\n Identification Number is: %7d\n Your Account number is: %10d\n Worker House Address is: %s\n Workers Portfolio is: %s\n Your weekly salary is: %f\n",firstName,lastName,id,accountNumber,address,role,emp.earnings());
		JOptionPane.showMessageDialog(null,message);
		}
		
	else if(role.equalsIgnoreCase("Employee paid by Commision")){
		String firstName = JOptionPane.showInputDialog("Enter Your first name");
		String lastName = JOptionPane.showInputDialog("Enter Your Surname");
		int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Your identification number in digits only"));
	    int accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Account Number"));
		String address = JOptionPane.showInputDialog("Please enter your address here");
		double sels = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount of this worker sells"));
		CommissionEmployee ce = new CommissionEmployee(sels);
			String message = String.format("First name is: %s\n Last name is: %s\n Identification Number is: %7d\n Your Account number is: %10d\n Worker House Address is: %s\n Workers Portfolio is: %s\n Your weekly salary is: %f\n",firstName,lastName,id,accountNumber,address,role,ce.earnings());
		JOptionPane.showMessageDialog(null,message);
		}
		
	else if(role.equalsIgnoreCase("Employee paid by salary and Commision")){
		String firstName = JOptionPane.showInputDialog("Enter Your first name");
		String lastName = JOptionPane.showInputDialog("Enter Your Surname");
		int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Your identification number in digits only"));
	    int accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Account Number"));
		String address = JOptionPane.showInputDialog("Please enter your address here");
		double sels = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount of this worker sells"));
		CommissionEmployee ce = new CommissionEmployee(sels);
		double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter your workers salary here"));
		SalaryEmployee sal = new SalaryEmployee(salary);
		BaseSalaryCommsionEmployee sc = new BaseSalaryCommsionEmployee(sal,ce);
	    double jollof = sal.earnings() + ce.earnings();
		sc.setTotal(jollof);
		String message = String.format("First name is: %s\n Last name is: %s\n Identification Number is: %7d\n Your Account number is: %10d\n Worker House Address is: %s\n Workers Portfolio is: %s\n Your weekly salary is: %f\n",firstName,lastName,id,accountNumber,address,role,sc.earnings());
		JOptionPane.showMessageDialog(null,message);
		}
	}
}