import javax.swing.JFrame;

import javax.swing.JButton;

import java.awt.GridLayout;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.HashSet;
public class CollectionWithFrame extends JFrame{
	public CollectionWithFrame(){
		
		setLayout(new GridLayout(2,2,50,70));
		LinkedHashSet<JButton> bt = new LinkedHashSet<JButton>();
		bt.add(new JButton("First"));
		bt.add(new JButton("Second"));
		bt.add(new JButton("Third"));
		bt.add(new JButton("Fourth"));
		
		for(JButton b:bt){
		add(b);
		} 
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
	}
	public static void main(String[] args){
		CollectionWithFrame frame = new CollectionWithFrame();
		frame.setVisible(true);
		
		
	}
}