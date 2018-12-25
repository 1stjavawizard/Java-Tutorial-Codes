import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JApplet;
import java.awt.event.MouseListener;


public class AppletClass extends JApplet implements ActionListener,MouseMotionListener,MouseListener{
	private int xdir = 0;
	private int ydir = 0;
	private int top = 10;
	private int A;
		private int B;
	private int bottom = 20;
	private Timer tim;
	private int X = getWidth() / 3;
	private int Y = getHeight() / 3;
	
	public void paint(Graphics g){
		Graphics2D gun = (Graphics2D)g;
		gun.setColor(Color.BLACK);
		gun.fillRect(0,0,getWidth(),getHeight());
		gun.setColor(Color.BLUE);
		gun.fillRoundRect(X,Y,getWidth() / 4,20,20,20);
		addMouseMotionListener(this);
		addMouseListener(this);
		//addActionListener(this);
		gun.setColor(Color.RED);
		gun.fillOval(xdir,ydir,getWidth() / 12,getHeight() / 12);
	  tim = new Timer(5000,this);
	  tim.start();
	}
	
	public void mouseDragged(MouseEvent e){
		X = e.getX() - (A / 3);
		Y = e.getY()- (B / 3); 
	}
	
	public void mouseMoved(MouseEvent e){
		
	}
	
	public void mouseEntered(MouseEvent g){}
	public void mouseClicked(MouseEvent g){
		
	}
	public void mouseReleased(MouseEvent g){}
   public void mouseExited(MouseEvent g){}
   	public void mousePressed(MouseEvent g){
		A = g.getX();
			B= g.getY();
	}
   
	public void actionPerformed(ActionEvent g){
		
		xdir = xdir + top;
		ydir = ydir + bottom;
		
		if( xdir <=0 ){
			top = -top;
			
		}
		else if(xdir >=  getWidth()-(getWidth() /12) ){
			
		  top = -top;
			
		}
		if(ydir <=0){
			
			
			bottom = -bottom;
		}
		else if(ydir >= getHeight() - (getHeight() / 12)){
			
			
			bottom = -bottom;
		}
		repaint();
		
		
	}
	
	public void paintUpdate(){
		
	}
	
	
	public void init(){
		//tim.start();
		
		
	}
	
	public void start(){
		
		//repaint();
		//new DrawingClass().setVisible(true);
	}
	
	public void stop(){
		System.out.println("We are stopping");
	}
	
	public void destroy(){
		System.out.println("You have destroy it");
	}
}