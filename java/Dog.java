import javax.swing.JOptionPane;
public class Dog extends Animal{
	public int d = 30;
	void sleep(){
		JOptionPane.showMessageDialog(null,"I am sleeping " + d);
	}
	 void run(){
		JOptionPane.showMessageDialog(null,"I am running and in Dog "+d);
	} 
	
	public static void main(String[] args){
		//Dog g = new Dog();
		Dog a = new Animal();
		//g.d = 40;
		a.run();
	}
}