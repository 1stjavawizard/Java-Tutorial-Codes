import javax.swing.JOptionPane;

public class EnhancedFor{
	public static void main(String[] args){
		int message= 0;
		int[] c = {3,4,9,150,200,400};
		for(int pufpuf:c){
		message +=pufpuf;
		// message = message + pufpuf;
		
			
	}
	float average =(float) message/c.length;
	JOptionPane.showMessageDialog(null,message);
	JOptionPane.showMessageDialog(null,c.length);
	JOptionPane.showMessageDialog(null,average);

	}
}