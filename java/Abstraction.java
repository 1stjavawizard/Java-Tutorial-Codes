import javax.swing.JOptionPane;
public abstract class Abstraction{
	public int a = 20;

	void run(){
		JOptionPane.showMessageDialog(null,"I am in abstract class");
	}
	
 public abstract void sleep();
 
}