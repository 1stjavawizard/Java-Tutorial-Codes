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
public class DrawingClass extends JComponent implements MouseMotionListener,ActionListener{
	private int xdir = 0;
	private int ydir = 0;
	public void paintComponent(Graphics g){
		Graphics2D gun = (Graphics2D)g;
		gun.setColor(Color.BLACK);
		gun.fillRect(0,0,getWidth(),getHeight());
		gun.setColor(Color.BLUE);
		gun.fillRoundRect(getWidth() / 3, getHeight() / 3,getWidth() / 4,20,20,20);
		addMouseMotionListener(this);
		gun.setColor(Color.RED);
		gun.fillOval(xdir,ydir,getWidth() / 12,getHeight() / 12);
	  
	}
	
	public void mouseDragged(MouseEvent e){
		new Timer(5000,this);
		
		
		if( ydir++ == e.getY()-getHeight()){
			ydir--;
		}
		else{
			ydir++;
		}
		if(xdir++ == e.getX()-getWidth()){
			xdir--;
		}
		else{
			xdir++;
		}
		repaint();
	}
	
	public void mouseMoved(MouseEvent e){
		
	}
	
	public void actionPerformed(ActionEvent g){
		
	}
	
	public void paintUpdate(){
		
	}
	
}