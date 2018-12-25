import javax.swing.JOptionPane;




public class EnumExamples{
	
	public static double add(double a,double b){
		Operation operate = Operation.ADDITION;
		double some = 0.0f;
if(operate==Operation.ADDITION){
	
	some = a + b;
	JOptionPane.showMessageDialog(null,some);
	
}
return some;
	}
	public static void main(String[] args){
EnumExamples s = new EnumExamples();
double a = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number"));
double b = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number"));
s.add(a,b);
	
/* 		Operation operate = null;
		double some = 0.0f;
		switch(operate){
		case ADDITION:
			some = a + b;
			JOptionPane.showMessageDialog(null,some);
			break;
		case SUBSTRACTION:
			some = a - b;
			JOptionPane.showMessageDialog(null,some);
			break;
		case MULTIPLICATION:
			some = a * b;
			JOptionPane.showMessageDialog(null,some);
			break;
		case DIVISION:
			some = a / b;
			JOptionPane.showMessageDialog(null,some);
			break;
			default:
			System.exit(0);
			break;
		}
		
	
	
		double a = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number"));
	    double b = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number"));
	    operate.ADDITION.calculate(a,b);
	} */
}
}