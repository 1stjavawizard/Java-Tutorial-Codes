import javax.swing.JOptionPane;
public class Correction2{
	public static void main(String[] args){
		String message = JOptionPane.showInputDialog("Enter any words");
		String ThreeWords = message.substring(2,3);
		JOptionPane.showMessageDialog(null,ThreeWords,"THREE WORDS",JOptionPane.INFORMATION_MESSAGE);
	}
}