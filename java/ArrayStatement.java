import javax.swing.JOptionPane;

public class ArrayStatement{
	public static void main(String[] args){
		int message= 0;
		int[] c = {3,4,9,150,200,400};
		for(int i =0; i < c.length;i++){
		message +=c[i];
		// message = message + c[i];
		
			
	}
	float average =(float) message/c.length;
	JOptionPane.showMessageDialog(null,message);
	JOptionPane.showMessageDialog(null,c.length);
	JOptionPane.showMessageDialog(null,average);

	}
}