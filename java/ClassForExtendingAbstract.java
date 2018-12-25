import javax.swing.JOptionPane;
public class ClassForExtendingAbstract extends Abstraction{
	 //public int b = 50;
	 public void sleep(){
		 JOptionPane.showMessageDialog(null,"I am completed "+ a);
	 }
	public static void main(String[] args){
		ClassForExtendingAbstract abs = new ClassForExtendingAbstract();
	 abs.run();
	 abs.sleep();
	}
}