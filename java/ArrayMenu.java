import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Dimension;
public class ArrayMenu extends JFrame{
	 JMenu[] menu;
	public ArrayMenu(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(400,400));
		String[] names= {"First","Second","Third"};
		JMenuBar bar = new JMenuBar();
		menu = new JMenu[3];
		int i=0;
		for(String name:names){
			menu[i]=new JMenu(name);
		    bar.add(menu[i]);
			i++;
			
			}	
			
		setJMenuBar(bar);
		setVisible(true);
		pack();
	}
	
	public static void main(String[] args){
		new ArrayMenu();
	}
}