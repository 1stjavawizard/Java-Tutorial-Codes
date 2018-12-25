import javax.swing.JOptionPane;

public class Client{
	public void welcome(){
String name = JOptionPane.showInputDialog("Please Enter your name");
JOptionPane.showMessageDialog(null,"Welcome " + name);

	}
}