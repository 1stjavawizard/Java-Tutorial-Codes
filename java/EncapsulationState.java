//import javax.swing.JOptionPane;


public class EncapsulationState{
	private int a;
	private int b;
	public EncapsulationState(int a, int b){
		this.a = a;
		this.b = b;
	}
	public int getA(){
		return a;
	}
	
	//public void setA(int k){
	//	a = k;
	//}
	
	
	public int getB(){
		return b;
	}
	
//public void setB(int j){
	//	b = j;
	//}
	public int add(){
		int sum = a + b;
		return sum;
	}
}