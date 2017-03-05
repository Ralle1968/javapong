package pack1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

	public KeyHandler() {
		// TODO Auto-generated constructor stub
	}

	
	public void keyPressed(KeyEvent e) {
		
		if (e.getKeyCode()==KeyEvent.VK_UP){
			Var.moveup = true;
		} else if (e.getKeyCode()==KeyEvent.VK_DOWN){
			Var.movedown = true;
		}
		
	}

	
	public void keyReleased(KeyEvent e) {
		
		if (e.getKeyCode()==KeyEvent.VK_UP){
			Var.moveup = false;
		} else if (e.getKeyCode()==KeyEvent.VK_DOWN){
			Var.movedown = false;
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
