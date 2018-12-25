import javax.swing.JOptionPane;
public class ClassThatImplementsInterface implements InterfaceClass{
	public void sleep(){
	
				JOptionPane.showMessageDialog(null,"I am sleeping "+ a);
		}
	
	public void run(){
		JOptionPane.showMessageDialog(null,"I am running");
	}
	
	public static void main(String args[]){
		ClassThatImplementsInterface s = new ClassThatImplementsInterface();
	s.sleep();
	s.run();
	}
}