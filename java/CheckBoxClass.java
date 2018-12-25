import javax.swing.JFrame;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;

public class CheckBoxClass implements ItemListener{
	private JCheckBox box1;
	private JCheckBox box2;
	private JCheckBox box3;
	private ImageIcon g;
	private JLabel label;
	public CheckBoxClass(){
		JFrame frame = new JFrame();
		//setting the layout
		BorderLayout b = new BorderLayout();
		frame.setLayout(b);
		// creating our desired components
		box1 = new JCheckBox("PRESIDENT");
		box1.setSelected(true);
		box1.setMnemonic(KeyEvent.VK_B);
		
		box2 = new JCheckBox("GOVERNOR");
		box3 = new JCheckBox("COMMSIONER");
		box3.setMnemonic(KeyEvent.VK_C);
		label = new JLabel();
		frame.add(box1,b.NORTH);
		frame.add(box2,b.SOUTH);
		frame.add(box3,b.WEST);
		frame.add(label,b.EAST);
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		box1.addItemListener(this);
		box2.addItemListener(this);
		box3.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent e){
		if(box2.isSelected()){
			g = new ImageIcon("images/p1.jpg");
			label.setIcon(g);
		}
		if(e.getItemSelectable() == box3){
			label.setText("welcome to box3");
		}
		else{
			label.setText("");
		}
		if (box1.isSelected()){
			//if(e.getStateChange() == ItemEvent.SELECTED){
				System.out.println("this is selected  ");
			//}
		
		}
		else {
			System.out.println("this is not selected");
		}
	}
	
	public static void main(String[] args){
		new CheckBoxClass();
	}
}

