import javax.swing.JOptionPane;

public class Encap extends EncapsulationState{
	public Encap(int a, int b){
		super();
	}
	public static void main(String[] args){
	Encap en = new Encap(20,40);
	 //en.setA(20);
	 en.getA();
	 //en.setB(40);
	 en.getB();
	 JOptionPane.showMessageDialog(null,"Your answer is "+en.add(),"ADDITION STATEMENT",JOptionPane.INFORMATION_MESSAGE);
	}
}