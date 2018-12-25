// import the event the listener
import java.awt.event.ActionListener;
// import the method for the stated event listener
import java.awt.event.ActionEvent;
//import all your desired components
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;


// event listener implementation using unanymous class

public class EventSample{
	private JButton btn;
	private ImageIcon g;
	public EventSample(){
		// create objects of your desired components
		JFrame frame = new JFrame();
		 // btn is the object create for event
		 btn = new JButton("Click me!");
		 // this help to load image for use
		  g = new ImageIcon("images/p1.jpg");
		 // this help to set the icon to the present state
		 btn.setIcon(g);
		 frame.setSize(400,500);
		 frame.add(btn);
		 // object is created for the purpose of registering
		 //someThing ch = new someThing();
		 frame.setVisible(true);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  // registration of even listener using "this" statement
     btn.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e){
  g = new ImageIcon("images/p2.png");
  btn.setIcon(g);
}
});
	  }

public static void main(String[] args){
	new EventSample();
}
}



















//class with the main method implementing the event listener-full implementaion

// step 1: implement the whole class
/* public class EventSample implements ActionListener{
	private JButton btn;
	private ImageIcon g;
	public EventSample(){
		// create objects of your desired components
		JFrame frame = new JFrame();
		 // btn is the object create for event
		 btn = new JButton("Click me!");
		 // this help to load image for use
		  g = new ImageIcon("images/p1.jpg");
		 // this help to set the icon to the present state
		 btn.setIcon(g);
		 frame.setSize(400,500);
		 frame.add(btn);
		 // object is created for the purpose of registering
		 //someThing ch = new someThing();
		 frame.setVisible(true);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  // registration of even listener using "this" statement
     btn.addActionListener(this);
	  }
public void actionPerformed(ActionEvent e){
	g = new ImageIcon("images/p2.png");
	btn.setIcon(g);
}
public static void main(String[] args){
	new EventSample();
}
}

 */





// use of nested class for listener implementation
/*public class EventSample{
	private JButton btn;
	private ImageIcon g;
	public EventSample(){
		// create objects of your desired components
		JFrame frame = new JFrame();
		 // btn is the object create for event
		 btn = new JButton("Click me!");
		 // this help to load image for use
		  g = new ImageIcon("images/p1.jpg");
		 // this help to set the icon to the present state
		 btn.setIcon(g);
		 frame.setSize(400,500);
		 frame.add(btn);
		 // object is created for the purpose of registering
		 someThing ch = new someThing();
		 frame.setVisible(true);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  // object is passed int the add() method
	  btn.addActionListener(ch);
	}
     // we create an inner that implements the listener
	class someThing implements ActionListener{
		public void actionPerformed(ActionEvent e){
			g = new ImageIcon("images/p2.png");
			if(e.getSource()== btn){
				btn.setIcon(g);
				}
				else{
					//g = new ImageIcon("images/p1.png");
					//btn.setIcon(g);
				}
		}
	}
public static void main(String[] args){
	new EventSample();
}	
} */