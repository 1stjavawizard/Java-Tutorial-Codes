import javax.swing.JOptionPane;
import java.util.ArrayList;

public class AddTenQuestions{
	public static void main(String[] args){
		ArrayList<String> r = new ArrayList<String>();
		for(int i=1;i<=5;i++){
			String questions = JOptionPane.showInputDialog("Enter Ten Questions in total");
			
			r.add(questions);
		switch(i){
				case 1:
				r.add(questions);
				JOptionPane.showMessageDialog(null,"IT IS ADDED SUCCESSFULLY","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
				break;
				case 2:
				r.add(questions);
				JOptionPane.showMessageDialog(null,"IT IS ADDED SUCCESSFULLY","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
				break;
				case 3:
				r.add(questions);
				JOptionPane.showMessageDialog(null,"IT IS ADDED SUCCESSFULLY","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
				break;
				case 4:
				r.add(questions);
				JOptionPane.showMessageDialog(null,"IT IS ADDED SUCCESSFULLY","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
				break;
				case 5:
				r.add(questions);
				JOptionPane.showMessageDialog(null,"IT IS ADDED SUCCESSFULLY","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
				
				default:
				System.exit(0);
			}
				} 
				String allquestions = String.format("Question no 1: %s ",r.get(0));
			JOptionPane.showMessageDialog(null,allquestions,"ALL THE QUESTIONS",JOptionPane.INFORMATION_MESSAGE);
	
	}
}