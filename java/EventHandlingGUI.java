import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
public class EventHandlingGUI extends JFrame implements ActionListener{
	JButton label;
	public EventHandlingGUI(){		
		super("JLabel Example");// new Jframe("JLabel Example");
	    setVisible(true);
		setSize(700,700);
		ImageIcon g = new ImageIcon(getClass().getResource("imageResized/p1.jpg"));
      label = new JButton();
	  label.setSize(20,50);
	  label.setText("I am");
	  label.setIcon(g);
	  JFrame.setIconImage("imageResized/p1.jpg");
	  //Changing ch = new Changing();
	  label.addActionListener(this);
	  label.setHorizontalTextPosition(SwingConstants.CENTER);
	  label.setToolTipText("I am not a button please!!");
	  add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JOptionPane.showMessageDialog(this,label.getText());
		}
		//private class Changing implements ActionListener{
		//	public void actionPerformed(ActionEvent e){
		//		label.setText("I have been changed");
		//}}
		public void actionPerformed(ActionEvent e){
			JOptionPane.showMessageDialog(rootPane,"You clicked "+label.getClass().getResource("p1.jpg"));
		}
		public static void main(String[] args){
			 new EventHandlingGUI();
		}
}