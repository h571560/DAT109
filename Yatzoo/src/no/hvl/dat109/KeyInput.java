package no.hvl.dat109;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends  KeyAdapter {
	
	private Handler handler;
	
	public KeyInput(Handler handler) {
		this.handler = handler;
	}
	

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
	}

	public Handler getHandler() {
		return handler;
	}
	
	public void setHandler(Handler handler) {
		this.handler = handler;
	}
}
