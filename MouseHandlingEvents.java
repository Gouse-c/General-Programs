import java.awt.*;
import java.awt.event.*;
class Mouse extends Frame implements MouseListener{
	Label l;
	String msg;
	public Mouse(){
		setLayout(new FlowLayout());
		l=new Label("Mouse Operations");
		add(l);
		
		this.addMouseListener(this);
	}
	public void mouseEntered(MouseEvent me){
		msg="Mouse Entered "+me.getX()+"  "+me.getY();
		l.setText(msg);
		setBackground(Color.green);
	}
	public void mouseClicked(MouseEvent me){
		msg="Mouse Clicked "+me.getX()+" "+me.getY();
		l.setText(msg);
		setBackground(Color.red);
	}
	public void mousePressed(MouseEvent me){
		msg="Mouse Pressed "+me.getX()+" "+me.getY();
		l.setText(msg);
		setBackground(Color.blue);
	}
	public void mouseReleased(MouseEvent me){
		msg="Mouse Released "+me.getX()+" "+me.getY();
		l.setText(msg);
		setBackground(Color.cyan);
	}
	public void mouseExited(MouseEvent me){
		msg="Mouse Exited "+me.getX()+" "+me.getY();
		l.setText(msg);
		setBackground(Color.orange);
	}
}
class MouseHandlingEvents{
	public static void main(String args[]){
		Mouse m=new Mouse();
		m.setSize(700,700);
		m.setVisible(true);
	}
}