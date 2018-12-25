import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.JApplet;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class AppletRoom extends JApplet implements ActionListener,MouseMotionListener,MouseListener{
	private int Y = 300;
	private int X = 100;
	private int A = 0;
	private int B = 0;
	private int ClickedX;
	private int ClickedY;
	private int w = 30;
	private int h = 20;
	public void paint(Graphics g){
		
		Graphics2D  goat = (Graphics2D)g;
		goat.setColor(Color.BLACK);		
		goat.fillRect(0,0,getWidth(),getHeight());
		goat.setColor(Color.RED);
		goat.fillRoundRect(X,Y,getWidth() / 3,10,20,20);
		addMouseMotionListener(this);
		goat.setColor(Color.GREEN);
		goat.fillOval(A,B,getWidth() /10 , getHeight() / 10);
		
		Timer tymer = new Timer(1000,this);
		tymer.start();
		
	}
	
	public void actionPerformed(ActionEvent e){
		 A = A + w;
		 B = A +h;
		if(A >= getWidth() -(getWidth() / 10)){
             
			  h = -h;
		}
		if(B>= getHeight() -(getHeight() / 10)){
			 w = -w;
		}
		if(A <= 0){
			w= -w;
			
		}
		
		if(B <= 0){
			h = -h;
			
		}
		
		
		
		
		
		// if(){}
		// if(){}
		repaint();
	}
	
	public void mouseDragged(MouseEvent f){
		X = f.getX() - ClickedX / 2;
		Y = f.getY() - ClickedY / 2;
	}
	public void mouseMoved(MouseEvent f){
		
		
	}
	
	public void mouseClicked(MouseEvent g){
	 
	}
	public void mousePressed(MouseEvent g){
		
	 ClickedY = g.getY();
	 ClickedX = g.getX();
	 
	}
	public void mouseEntered(MouseEvent g){}
	public void mouseExited(MouseEvent g){}
	public void mouseReleased(MouseEvent g){}
	
	public void init(){
       	System.out.println("This is X position of my mouse "+ClickedX);
		System.out.println("This is Y position of my mouse "+ClickedY);
	}
	
	public void start(){
		
	}
	
	public void stop(){}
	
	public void destroy(){}
}