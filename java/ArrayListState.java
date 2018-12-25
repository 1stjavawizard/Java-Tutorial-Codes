import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ArrayListState{
	public static void main(String[] args){
		ArrayList<String> username = new ArrayList<String>();
		username.add("red");
		username.add("green");
		username.add("yellow");
		username.add("purple");
		username.add("black");
		username.add("violet");
		for(int i = 0; i < username.size(); i++){
		JOptionPane.showMessageDialog(null,username.get(i),"Color types",JOptionPane.ERROR_MESSAGE);
				int sel= JOptionPane.showConfirmDialog(null,username.get(i),"Color types",JOptionPane.YES_NO_CANCEL_OPTION);
				if (sel==JOptionPane.NO_OPTION){
							JOptionPane.showMessageDialog(null,"YOUR SELECTED NO","YOUR CHOICE",JOptionPane.INFORMATION_MESSAGE);
				}
				else{
				JOptionPane.showMessageDialog(null,"YOUR SELECTED OTHER OPTIONS","YOUR CHOICE",JOptionPane.INFORMATION_MESSAGE);
				}
				
		}
	}
	
	// CONFIRM OPTIONS
	// YES_NO_OPTION
	// OK_CANCEL_OPTION
	//DEFAULT_OPTION
	//YES_NO_CANCEL_OPTION
	// TYPES
	//NO_OPTION
	//YES_OPTION
	// OK_OPTION
	// CANCEL OPTION
	// CLOSED_OPTION
}

