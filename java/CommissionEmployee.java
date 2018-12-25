public class CommissionEmployee extends EmployeeInfo{
	private double salesMade; // money is in currency form
public CommissionEmployee(double salesMade){
	this.salesMade = salesMade;
}

public double getSalesMade(){
	return salesMade;
}

public double earnings(){
	double TotalEarning =  getSalesMade() / 100;
	return TotalEarning;
	}
	}